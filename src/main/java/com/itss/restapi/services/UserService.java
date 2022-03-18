package com.itss.restapi.services;

import com.itss.restapi.entities.User;
import com.itss.restapi.repositories.UserRepository;
import com.itss.restapi.user.UserCredentials;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  EmailSenderService emailSenderService;
  PasswordEncoder passwordEncoder;

  public UserService() {
    this.passwordEncoder = new BCryptPasswordEncoder();
  }

  public List<User> getUsers() {
    return userRepository.findAll();
  }

  public User getUser(String useCpf) {
    return userRepository.findByUseCpf(useCpf);
  }

  public User saveUser(User user) {
    emailSenderService.sendEmail(
      user.getUseEmail(),
      "Bem vindo",
      "Cpf: " + user.getUseCpf() + "\nSenha: " + user.getUseSenha()
    );
    String encodedPassword = this.passwordEncoder.encode(user.getUseSenha());
    user.setUseSenha(encodedPassword);

    return userRepository.save(user);
  }

  public ResponseEntity<Boolean> authUser(UserCredentials userCredentials) {
    User user = userRepository.findByUseCpf(userCredentials.getCpf());
    if (user == null) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
    }
    boolean valid = passwordEncoder.matches(
      userCredentials.getPassword(),
      user.getUseSenha()
    );
    HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;

    return ResponseEntity.status(status).body(valid);
  }
}
