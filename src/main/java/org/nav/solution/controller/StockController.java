package org.nav.solution.controller;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.nav.solution.dao.CategoryDao;
import org.nav.solution.model.Category;
import org.nav.solution.model.Stock;
import org.nav.solution.service.CategoryService;
import org.nav.solution.service.StockService;
//import org.nav.solution.validation.StockValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.
        annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Controller
public class StockController {
 // private final Logger logger= LoggerFactory.getLogger(StockController.class);
    @Autowired
   private StockService stockService;

@Autowired
private CategoryService categoryService;

//    @RequestMapping(value = "/stock", method = RequestMethod.GET)
//    public String returnStock() {
//        return "stock";
//
//    }

    @RequestMapping(value = "/stock", method = RequestMethod.GET)
    public String returnCategory(Model model) {
        model.addAttribute("categoryList", categoryService.listAllCategory());
        return "stock";

    }
        @RequestMapping(value="/savestock", method = RequestMethod.POST)
   public String Save(@RequestParam("productName")String productName,
                      @RequestParam("productCategory")Category prductCategory,
                      @RequestParam("productCompanyName")String productCompanyName,
                   @RequestParam("productLocalName")String productLocalName,
                       @RequestParam("productQuantity")long productQuantity,
                       @RequestParam("productCode")long productCode,
                       @RequestParam("productRack")long productRack,
                       @RequestParam("productRow")long productRow,
                       @RequestParam("productTallyName")String productTallyName,
                      @RequestParam("productPriceMax")Double productPriceMax,
                      @RequestParam("productPrice")Double productPriceMin,
                      @RequestParam("productImage")Byte productImages){

        Category category=new Category();
        Stock stock=new Stock();
        stock.setProductCompanyName(productName);
        stock.setProductCategory(prductCategory);
        stock.setProductCompanyName(productCompanyName);
        stock.setProductLocalName(productLocalName);
        stock.setProductQuantitiy(productQuantity);
        stock.setProductCode(productCode);
        stock.setProductRack(productRack);
     stock.setProductRow(productRow);
        stock.setProductTallyName(productTallyName);
        stock.setProductPriceMax(productPriceMax);
        stock.setProductPriceMin(productPriceMin);
        stock.setProductImages(productImages);
        stockService.insert(stock);
       return "redirect:/displayStock";

    }

}