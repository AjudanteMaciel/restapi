package com.itss.restapi.controllers;

import com.itss.restapi.entities.Product;
import com.itss.restapi.services.ProductService;
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
public class ProductController {

  @Autowired
  ProductService productService;

  @GetMapping("/product/getall")
  public List<Product> getProducts() {
    return productService.getProducts();
  }

  @GetMapping("/product/get")
  public Optional<Product> getProduct(Long proId) {
    return productService.getProduct(proId);
  }

  @PostMapping("/product/add")
  public Product saveProduct(@RequestBody Product product) {
    return productService.saveProduct(product);
  }
}
