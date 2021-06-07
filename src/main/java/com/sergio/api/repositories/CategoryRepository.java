package com.sergio.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergio.api.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
