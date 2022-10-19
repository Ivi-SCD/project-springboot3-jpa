package com.iviprojects.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iviprojects.course.entities.Payment;
import com.iviprojects.course.repositories.PaymentRepository;

@Service
public class PaymentService{
	
	@Autowired
	PaymentRepository paymentReposirtory;
	
	public List <Payment> findAll () {
		return paymentReposirtory.findAll();
	}
	
	public Payment findById(Long id) {
		Optional <Payment> payment = paymentReposirtory.findById(id);
		return payment.get();
	}
}