package com.itss.restapi.services;

import com.itss.restapi.entities.Request;
import com.itss.restapi.repositories.RequestRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

  @Autowired
  RequestRepository requestRepository;

  public List<Request> getRequests() {
    return requestRepository.findAll();
  }

  public Optional<Request> getRequest(Long reqId) {
    return requestRepository.findById(reqId);
  }

  public Request saveRequest(Request request) {
    return requestRepository.save(request);
  }

  public List<Request> listRequests() {
    return requestRepository.findAll();
  }
}
