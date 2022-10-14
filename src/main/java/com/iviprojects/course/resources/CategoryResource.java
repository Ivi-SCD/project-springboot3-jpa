package com.iviprojects.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iviprojects.course.entities.Category;
import com.iviprojects.course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	//ResourcesLayers is utilized for requests in application
	// and build the web project in a site;
	// NEED a injection dependency with ServiceLayer
	
	@Autowired 
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity <List<Category>> findAll() {
		List <Category> listCategory = categoryService.findAll();
		return ResponseEntity.ok().body(listCategory);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category category = categoryService.findById(id);
		return ResponseEntity.ok().body(category);
	}
}