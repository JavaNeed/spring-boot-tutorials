package com.common.service;

import com.common.model.Category;

public interface CategoriesService {
	Iterable<Category> findAllCategories();
}
