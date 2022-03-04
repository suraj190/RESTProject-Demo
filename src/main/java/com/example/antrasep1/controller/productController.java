package com.example.antrasep1.controller;


import com.example.antrasep1.entity.Product;
import com.example.antrasep1.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class productController {

   @Autowired
    productService pService;

   @GetMapping("/")
   public String home(){
       return "Product Homepage";
   }

   @GetMapping("/product/{id}")
    public Product getProductbyId(){
        return null;
    }

   @GetMapping("/product")
    public ArrayList<Product> getAllProducts(){
        return pService.getProducts();
   }

   @PostMapping("/product")
    public void createProduct(){

   }

   @PutMapping("/product")
    public void updateProduct(){

   }

   @DeleteMapping("/product/{id}")
    public void deleteProduct(){

   }


}
