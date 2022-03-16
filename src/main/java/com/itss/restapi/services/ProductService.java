package com.itss.restapi.services;

import com.itss.restapi.entities.Product;
import com.itss.restapi.repositories.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  @Autowired
  ProductRepository productRepository;

  public List<Product> getProducts() {
    return productRepository.findAll();
  }

  public Optional<Product> getProduct(Long proId) {
    return productRepository.findById(proId);
  }

  public Product saveProduct(Product product) {
    return productRepository.save(product);
  }
}
