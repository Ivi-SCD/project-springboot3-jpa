package com.iviprojects.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iviprojects.course.entities.Order;
import com.iviprojects.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	//Autowired annotation is utilized for dependecy injection [!]
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional <Order> order = orderRepository.findById(id);
		return order.get();
	}
}