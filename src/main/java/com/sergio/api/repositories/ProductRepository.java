package com.sergio.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergio.api.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
