package com.iviprojects.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iviprojects.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
