package com.bharath.product.dao;

import com.bharath.product.dto.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductDAOImplTest {

    @Test
    public void createShouldCreateProduct() {
        ProductDAO dao=new ProductDAOImpl();
        Product product=new Product();
        product.setId(1);
        product.setName("IPhone");
        product.setDescription("att");
        product.setPrice(800);
        dao.create(product);
        dao.read(1);
        Product result = dao.read(1);
        assertNotNull(result);
        assertEquals("IPhone", result.getName());
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}