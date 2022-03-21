package com.itss.restapi.repositories;

import com.itss.restapi.entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {}
