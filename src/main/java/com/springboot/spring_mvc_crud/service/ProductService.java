package com.springboot.spring_mvc_crud.service;

import com.springboot.spring_mvc_crud.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    void deleteById(int id);
}
