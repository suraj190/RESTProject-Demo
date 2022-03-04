package com.example.antrasep1.dao;

import com.example.antrasep1.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class productDAOImpl implements productDAO {

    @Override
    public HashMap<Long, Product> productMap() {

        HashMap<Long,Product> pMap = new HashMap<>();
        pMap.put(1L,new Product(1L,"Coke",2,300));
        pMap.put(2L,new Product(2L,"Sprite",1.5,100));
        pMap.put(3L,new Product(3L,"Redbull",5,150));
        pMap.put(4L,new Product(4L,"DietCoke",2.5,200));

        return pMap;

    }
}
