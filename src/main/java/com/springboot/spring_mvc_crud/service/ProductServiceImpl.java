package com.springboot.spring_mvc_crud.service;

import com.springboot.spring_mvc_crud.dao.ProductRepository;
import com.springboot.spring_mvc_crud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository repository;

    @Autowired
    public ProductServiceImpl(ProductRepository repository){
        this.repository=repository;
    }
    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product findById(int id) {
        Optional<Product> optionalProduct = repository.findById(id);
        return optionalProduct.orElseThrow();
    }

    @Override
    public void save(Product product) {
        repository.save(product);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
