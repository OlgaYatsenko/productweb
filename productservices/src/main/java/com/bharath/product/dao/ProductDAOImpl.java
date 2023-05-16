package com.bharath.product.dao;

import com.bharath.product.dto.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductDAOImpl implements ProductDAO {

    Map<Integer, Product> productMap= new HashMap<>();
    @Override
    public void create(Product product) {
        productMap.put(product.getId(), product);

    }
    public Map<Integer, Product> getProductMap(){
        return productMap;
    }

    @Override
    public Product read(int id) {
        return productMap.get(id);
    }



    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(int id) {

    }
}
