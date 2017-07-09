/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dekikurnia.repositories;

import com.dekikurnia.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dekikurnia
 */
@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
