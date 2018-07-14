package org.nav.solution.controller;

import org.nav.solution.model.Shipper;
import org.nav.solution.service.ShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShipperController {
    @Autowired
    private ShipperService shipperService;
    @RequestMapping(value="/shipper", method = RequestMethod.GET)
    public String retrunShipper(){
        return "shipper";
        }
    @RequestMapping(value= "/saveshipper",method =RequestMethod.POST)
    public String save(@RequestParam("shipperName")String shipperName,
                       @RequestParam("shipperRegistration")long shipperRegistration,
                       @RequestParam("shipperEmail")String shipperEmail,
                       @RequestParam("shipperPhone")String shipperphone,
                       @RequestParam("shipperMobile")String shipperMobile,
                       @RequestParam("shipperWebsite")String shipperWebSite,
                       @RequestParam("shipperCountry")String shipperCountry,
                       @RequestParam("shipperState")String shipperState,
                       @RequestParam("shipperDistrict")String shipperDistrict,
                       @RequestParam("shipperCity")String shipperCity,
                       @RequestParam("shipperStreet")String shipperStreet,
                       @RequestParam("shipperPostal")String shipperPostal){

        Shipper shipper=new Shipper();
        shipper.setShipperName(shipperName);
        shipper.setShipperRegistration(shipperRegistration);
        shipper.setShipperEmail(shipperEmail);
        shipper.setShipperPhone(shipperphone);
        shipper.setShipperMobile(shipperMobile);
        shipper.setShipperWebsite(shipperWebSite);
        shipper.setShipperCountry(shipperCountry);
        shipper.setShipperState(shipperState);
        shipper.setShipperDistrict(shipperDistrict);
        shipper.setShipperCity(shipperCity);
        shipper.setShipperStreet(shipperStreet);
        shipper.setShipperPostal(shipperPostal);
        shipperService.insert(shipper);
        return "redirect:/shipper";


    }



    }

