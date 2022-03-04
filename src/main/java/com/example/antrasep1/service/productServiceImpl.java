package com.example.antrasep1.service;

import com.example.antrasep1.dao.productDAO;
import com.example.antrasep1.entity.Product;
import com.example.antrasep1.exceptions.IdExistsExcpetion;
import com.example.antrasep1.exceptions.IdNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class productServiceImpl implements productService{


    @Autowired
    productDAO pDAO;

    @Override
    public Product getProductbyID(Long id) {

        if(pDAO.productMap().containsKey(id)){
            return pDAO.productMap().get(id);
        }
        else{
            throw new IdNotFoundException("Product ID doesn't exist, could not retrieve product");
        }
    }

    @Override
    public ArrayList<Product> getProducts() {
        return new ArrayList<>(pDAO.productMap().values());
    }

    @Override
    public void createProduct(Product Product) {
        if(pDAO.productMap().containsKey(Product.getId())){
            throw new IdExistsExcpetion("Product ID already exists, please choose a new ID");
        }
        else{
            pDAO.productMap().put(Product.getId(),Product);
        }
    }

    @Override
    public void updateProduct(Product Product) {

        if(pDAO.productMap().containsKey(Product.getId())){
            pDAO.productMap().replace(Product.getId(),Product);
        }
        else{
            throw new IdNotFoundException("Product ID not found, could not update product");
        }
    }

    @Override
    public void deleteProduct(Product Product) {
        if(pDAO.productMap().containsKey(Product.getId())){
            pDAO.productMap().put(Product.getId(),Product);
        }
        else{
            throw new IdNotFoundException("Product ID not found, could not delete product");
        }
    }
}
