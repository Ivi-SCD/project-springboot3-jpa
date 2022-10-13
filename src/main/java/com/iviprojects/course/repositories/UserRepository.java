package com.iviprojects.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iviprojects.course.entities.User;

//Opcional a anottation do @Repository pois ele já herda de JPARepository [!]
public interface UserRepository extends JpaRepository <User, Long> {
	
}