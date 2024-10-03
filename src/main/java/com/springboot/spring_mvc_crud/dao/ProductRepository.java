package com.springboot.spring_mvc_crud.dao;

import com.springboot.spring_mvc_crud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
