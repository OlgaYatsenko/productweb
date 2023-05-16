package com.bharath.product.servlets;

import com.bharath.product.bo.ProductBO;
import com.bharath.product.bo.ProductBOImpl;
import com.bharath.product.dto.Product;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "com.bharath.product.servlets.DisplayProductDetailsServlet", value = "/com.bharath.product.servlets.DisplayProductDetailsServlet")
public class DisplayProductDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductBO bo = new ProductBOImpl();
        Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
        PrintWriter out=response.getWriter();
        out.print("Product Details");
        out.print("Product ID: "+product.getId());
        out.print("Product Name: "+product.getName());
        out.print("Product Description: "+product.getDescription());
        out.print("Product Price: "+product.getPrice());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}