package com.iviprojects.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iviprojects.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}