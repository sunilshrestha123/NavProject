package org.nav.solution.controller;

import org.nav.solution.model.Sales;
import org.nav.solution.model.Stock;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class SalesController {
    @RequestMapping(value ="/sales",method = RequestMethod.GET)
    public static String returnSales(){
        return "sales";



    }

  @RequestMapping(value="/savesales",method = RequestMethod.POST)
    public String save(
                       @RequestParam("invoiceno")long invoiceNo,
                       @RequestParam("partyName")String partynName,
                       @RequestParam("productName")String productName,
                      @RequestParam("productQuantity")int productQuantity,
                      @RequestParam("productprice")double productPrice



                        ){

        float TotalPrice = (float)productQuantity*(float)productPrice;
Stock stock=new Stock();
     Sales sales=new Sales();

sales.setInvoiceNo(invoiceNo);
sales.setPartyName(partynName);
//sales.setSalesDate(salesDate);
//sales.setProductName(productName);
sales.setProductQuantity(productQuantity);
sales.setTotoalAmount(TotalPrice);
return "sales";

    }

}
