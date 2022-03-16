package com.itss.restapi.repositories;

import com.itss.restapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
  User findByUseCpf(String useCpf);
}
