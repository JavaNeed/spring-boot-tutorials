package com.common.repository;

import org.springframework.data.repository.CrudRepository;

import com.common.model.Category;

public interface CategoriesRepository extends CrudRepository<Category, String>{

}
