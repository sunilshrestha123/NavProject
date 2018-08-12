package org.nav.solution.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.nav.solution.dao.CategoryDao;
import org.nav.solution.model.Category;
import org.nav.solution.model.Register;
import org.nav.solution.model.Stock;
import org.nav.solution.service.CategoryService;
import org.nav.solution.service.StockService;
//import org.nav.solution.validation.StockValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
    @RequestMapping(value = "/detailStock/{id}",method = RequestMethod.GET)
       public String displayStockById(@PathVariable("id")long productId,Model model){
       //model.addAttribute("stockList",stockService.listAllStock());
      model.addAttribute("stock",stockService.getStockById(productId));
        return "displayStock";

    }
    @RequestMapping(value="/editStock/{id}",method = RequestMethod.GET)
    public String editStock(@PathVariable("id")long productId,Model model){
        model.addAttribute("stock",stockService.getStockById(productId));
        return "editStock";

    }
    @RequestMapping(value="/deleteStock/{id}")
    public  String deleteStock(@PathVariable("id") long productId ,@PathVariable("stock")Stock stock){
  this.stockService.delete(productId,stock);
  return "redirecty:/displayStock";


    }

    @RequestMapping(value="/displaystock",method = RequestMethod.GET)
    public String returnDisplay(Model model){
        model.addAttribute("stockList",stockService.listAllStock());
      //  model.addAttribute("stock1",stockService.getStockById());
        return "displayStock";
    }
        @RequestMapping(value="/savestock", method = RequestMethod.POST)
   public String Save(@RequestParam("productName")String productName,
                      @RequestParam("productCategory")int productCategory,
                      @RequestParam("productCompanyName")String productCompanyName,
                   @RequestParam("productLocalName")String productLocalName,
                       @RequestParam("productQuantity")long productQuantity,
                       @RequestParam("productCode")long productCode,
                       @RequestParam("productRack")long productRack,
                       @RequestParam("productRow")long productRow,
                       @RequestParam("productTallyName")String productTallyName,
                      @RequestParam("productPriceMax")Double productPriceMax,
                      @RequestParam("productPrice")Double productPriceMin,
                      @RequestParam("productImage")Byte[] productImages){


        productName=productName.toUpperCase();
        productCompanyName=productCompanyName.toUpperCase();
        productLocalName=productLocalName.toUpperCase();
        productTallyName=productTallyName.toUpperCase();
            System.out.println(productName);

            System.out.println(productCode);
          System.out.println(productCategory);
            System.out.println(productRack);

   Category Category=new Category();
    Category.setCategoryid(productCategory);
    Stock stock=new Stock();
        stock.setProductName(productName);
       stock.setCategory(Category);
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

//

}