package com.springboot.spring_mvc_crud.controller;

import com.springboot.spring_mvc_crud.entity.Product;
import com.springboot.spring_mvc_crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    private final ProductService service;

    @Autowired
    public ProductController(ProductService service){
        this.service=service;
    }
    @GetMapping("/")
    public String getAllProducts(Model theModel){
        List<Product> products = service.findAll();
        theModel.addAttribute("products",products);
        return "product-list";
    }

    @GetMapping("/showFormForAdd")
    public String addNewProduct(Model theModel){
        theModel.addAttribute("product",new Product());
        return "add-update-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Product product){
        service.save(product);
        return "add-update-form";
    }

    @GetMapping("/update")
    public String update(@RequestParam("productId") int id,Model theModel){
        Product theProduct=service.findById(id);
        theModel.addAttribute("product",theProduct);
        return "add-update-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("productId") int id){
        service.deleteById(id);
        return "redirect:/";
    }
}
