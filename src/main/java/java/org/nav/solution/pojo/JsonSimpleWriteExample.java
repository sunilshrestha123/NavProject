package java.org.nav.solution.pojo;

import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSimpleWriteExample {
    public static void main(String[] args) {
        JSONObject obj=new JSONObject();
        obj.put("name","sunil shrestha");
        obj.put("name of company", "nav solution");
        obj.put("birthdate","2075.04.12");
        obj.put("age",new Integer(12));
        try(FileWriter file = new FileWriter("F:\\test.json")){
        file.write(obj.toString());
            file.flush();

        }catch(IOException e){
            e.printStackTrace();

        }
        System.out.println(obj);
    }

}
