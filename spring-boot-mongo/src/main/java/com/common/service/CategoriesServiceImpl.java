package com.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.common.model.Category;
import com.common.repository.CategoriesRepository;


@Component
public class CategoriesServiceImpl implements CategoriesService{
	
	@Autowired
	private CategoriesRepository categoriesRepository;

	@Override
	public Iterable<Category> findAllCategories() {
		Iterable<Category> categories = categoriesRepository.findAll();
		return categories;
	}
}
