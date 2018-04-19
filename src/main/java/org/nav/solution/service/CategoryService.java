package org.nav.solution.service;

import org.nav.solution.model.Category;

import java.util.List;

public interface CategoryService {
void insert(Category category);
List<Category> listAllCategory();
void  delete(Category category);
}

