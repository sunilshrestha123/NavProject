//package org.nav.solution.api;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//public class StockApi {
//
//        @RequestMapping(value="/test",method= RequestMethod.GET)
//        public String hello(){
//            return "hello";
//        }
//        @RequestMapping(value="/json/test",method = RequestMethod.GET)
//        public String returnJson(){
//            Map<String,Object> personDetails=new HashMap<String,Object>();
//            personDetails.put("name","madhu neupane");
//
//            Gson gson=new Gson();
//            String jsonObject=gson.toJson(personDetails).toString();
//
//            return jsonObject;
//        }
//    @RequestMapping(value="/jsonobject/test",method = RequestMethod.GET)
//    public JSONObject returnJsonobject(){
//        JSONObject jsonObject= new JsonObject();
//        jsonObject.put("name","madhu neupane");
//
//        return jsonObject;
//    }
//
//        //we use @RequestBody to handle the json data request
//    }
//
//
//
//
//
//}
