package com.itss.restapi.controllers;

import com.itss.restapi.entities.Request;
import com.itss.restapi.services.RequestService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RequestController {

  @Autowired
  RequestService requestService;

  @GetMapping("/request/getall")
  public List<Request> getRequests() {
    return requestService.getRequests();
  }

  @GetMapping("/request/get")
  public Optional<Request> getRequest(Long reqId) {
    return requestService.getRequest(reqId);
  }

  @PostMapping("/request/add")
  public Request saveRequest(@RequestBody Request request) {
    return requestService.saveRequest(request);
  }
}
