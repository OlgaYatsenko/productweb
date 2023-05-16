package com.bharath.product.servlets;

import com.bharath.product.bo.ProductBO;
import com.bharath.product.bo.ProductBOImpl;
import com.bharath.product.dao.ProductDAOImpl;
import com.bharath.product.dto.Product;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "com.bharath.product.servlets.CreateProductServlet", value = "/com.bharath.product.servlets.CreateProductServlet")
public class CreateProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id= Integer.parseInt(request.getParameter("id"));
        String name= request.getParameter("name");
        String description= request.getParameter("description");
        Integer price= Integer.parseInt(request.getParameter("price"));
        Product product=new Product();
        product.setId(id);
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);

        ProductBO bo=new ProductBOImpl();
        bo.create(product);

        PrintWriter out=response.getWriter();
        out.print("Product created");


    }
}