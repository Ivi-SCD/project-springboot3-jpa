package com.iviprojects.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iviprojects.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
