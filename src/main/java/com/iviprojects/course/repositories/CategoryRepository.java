package com.iviprojects.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iviprojects.course.entities.Category;

//Opcional a anottation do @Repository pois ele já herda de JPARepository [!]
public interface CategoryRepository extends JpaRepository <Category, Long> {
	
}