package org.nav.solution.controller;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.nav.solution.model.Category;
import org.nav.solution.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping(value="/product")
    public String returnProduct(){
return "product";


    }

    @RequestMapping(value="/category")
public String returnCategory(Model model){
        model.addAttribute("categoryList",categoryService.listAllCategory());
        Category category=new Category();
        //categoryName=categoryName.toUpperCase();
//        category.getCategoryName();
//
//        String result="THE NEW CATREGORY "+categoryName+" HAS been SUCCESSFULLY ADDED";
//        model.addAttribute("message",result);
        return "category";

    }
//    @RequestMapping(value="/displayproduct")

    @RequestMapping(value="/savecategory",method = RequestMethod.POST)
    public String save(@RequestParam("categoryName") String categoryName,Model model){

        Category category=new Category();
        category.setCategoryName(categoryName);
        categoryService.insert(category);

        return "redirect:/category";
    }

@RequestMapping(value ="/deletecategory/{id}",method = RequestMethod.GET)
public String delete(@PathVariable("id") int categoryid){
        Category category=new Category();
        category.setCategoryid(categoryid);
        categoryService.delete(category);
        return "redirect:/category";


}


        }

