package java.org.nav.solution.pojo;

import org.json.JSONObject;

public class JsonEncodeDemo {

    public static void main(String[] args) {
        JSONObject obj = new JSONObject();

        obj.put("name", "sunil");
        obj.put("num", new Integer(1000));
        obj.put("balance", new Double(1999.9));
        obj.put("value", new Boolean(true));
        System.out.println(obj);

//
//
//        obj.put("name", "foo");
//        obj.put("num", new Integer(100));
//        obj.put("balance", new Double(1000.21));
//        obj.put("is_vip", new Boolean(true));
//
//        System.out.print(obj);
//    }
    }
}

