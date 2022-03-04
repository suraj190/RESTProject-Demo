package com.example.antrasep1.service;

import com.example.antrasep1.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

public interface productService {

    Product getProductbyID(Long id);
    ArrayList<Product> getProducts();
    void createProduct(Product Product);
    void updateProduct(Product Product);
    void deleteProduct(Product Product);
}
