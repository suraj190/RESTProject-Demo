package com.example.antrasep1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
public class Product {

    private Long id;
    private String name;
    private double cost;
    private int quantity;



    public Product(Long id,String name, double cost, int quantity){

        this.id = id;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public Product() {

    }
}
