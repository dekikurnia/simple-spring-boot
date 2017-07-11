/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dekikurnia.controllers;

import com.dekikurnia.entities.Product;
import com.dekikurnia.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dekikurnia
 */
@RestController
public class ProductRestController {
    
    @Autowired
    private ProductService productService;
    
    @RequestMapping(path="/api/products", method=RequestMethod.GET)
    public Iterable <Product> getAllProducts() {
        return productService.getAllProducts();
    }
    
    @RequestMapping(path="/api/products/{id}", method=RequestMethod.GET)
    public Product getProductById(@PathVariable("id") Integer id) {
        return productService.getProductById(id);
    }
}
