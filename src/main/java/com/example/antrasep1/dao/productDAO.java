package com.example.antrasep1.dao;

import com.example.antrasep1.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

public interface productDAO {

    HashMap<Long,Product> productMap();
}
