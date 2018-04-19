package org.nav.solution.serviceImpl;

import org.nav.solution.dao.CategoryDao;
import org.nav.solution.model.Category;
import org.nav.solution.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryDao categoryDao;
    public void insert(Category category) {
    categoryDao.insert(category);
    }
    public List<Category> listAllCategory() {
        return categoryDao.getAllCategory();
    }
    public void delete(Category category){
        categoryDao.delete(category);
    }
}

