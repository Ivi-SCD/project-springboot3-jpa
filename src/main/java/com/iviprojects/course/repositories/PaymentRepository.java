package com.iviprojects.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iviprojects.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}