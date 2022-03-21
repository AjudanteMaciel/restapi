package com.itss.restapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

  @Autowired
  JavaMailSender mailSender;

  public void sendEmail(String toEmail, String subject, String body) {
    try {
      SimpleMailMessage message = new SimpleMailMessage();

      message.setFrom("macieldfaria@gmail.com");
      message.setTo(toEmail);
      message.setText(body);
      message.setSubject(subject);
      mailSender.send(message);

      System.out.println("Email enviado com sucesso...");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
