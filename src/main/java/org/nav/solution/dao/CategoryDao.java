package org.nav.solution.dao;

import org.nav.solution.model.Category;

import java.util.List;

public interface CategoryDao {
    void insert(Category category);
    void delete(Category category);
    List<Category> getAllCategory();

}
