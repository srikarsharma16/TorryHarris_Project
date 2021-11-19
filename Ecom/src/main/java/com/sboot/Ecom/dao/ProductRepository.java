package com.sboot.Ecom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sboot.Ecom.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
