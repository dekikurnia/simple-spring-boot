/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dekikurnia.services;

import com.dekikurnia.entities.Product;
import java.util.List;

/**
 *
 * @author dekikurnia
 */
public interface ProductService {
    
    Iterable<Product> getAllProducts();
    public Product getProductById(Integer id);
    Product saveProduct(Product product);
    void deleteProduct(Integer id);
}
