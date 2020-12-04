package Lab5;
import netscape.javascript.JSObject;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class menu1 {
    public static void main(String[] args) throws FileNotFoundException {
        JSONParser jsonParser = new JSONParser();

        try(FileReader reader = new FileReader("json/menu1.json"))
        {
            Object obj = jsonParser.parse(reader);

            JSONObject jsonObject = (JSONObject) obj;
            JSONObject menu = (JSONObject) jsonObject.get("menu");
            String header = (String) menu.get("header");
            System.out.println(header);
            JSONArray item = (JSONArray) menu.get("item");
            item.forEach(items -> parseMenu((JSONObject) items));
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }catch (ParseException ex){
            ex.printStackTrace();
        }
    }

    private static void parseMenu(JSONObject items){

        if(items==null){
            System.out.println("null");
        }else {
            String title = (String)items.get("id");
            System.out.println(title);
        }
    }
}
