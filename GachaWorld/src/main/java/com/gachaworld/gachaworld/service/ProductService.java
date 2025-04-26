package com.gachaworld.gachaworld.service;

import com.gachaworld.gachaworld.dao.ProductDAO;
import com.gachaworld.gachaworld.model.Product;

import java.util.List;

public class ProductService {

    private ProductDAO productDAO;

    public ProductService() {
        productDAO = new ProductDAO();
    }

    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }
}
