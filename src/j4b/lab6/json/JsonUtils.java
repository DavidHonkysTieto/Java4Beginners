package j4b.lab6.json;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtils {
	
	/*
     * Java Method to write JSON String to file
     */
    @SuppressWarnings("unchecked")
	public static void writeJson(String file) {
        JSONObject json = new JSONObject();
        json.put("title", "Harry Potter and Half Blood Prince");
        json.put("author", "J. K. Rolling");
        json.put("price", 20);

        JSONArray jsonArray = new JSONArray();
        jsonArray.add("Harry");
        jsonArray.add("Ron");
        jsonArray.add("Hermoinee");

        json.put("characters", jsonArray);

        try {
            System.out.println("Writting JSON into file ...");
            System.out.println(json);
            FileWriter jsonFileWriter = new FileWriter(file);
            jsonFileWriter.write(json.toJSONString());
            jsonFileWriter.flush();
            jsonFileWriter.close();
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readJson(String file) {
        JSONParser parser = new JSONParser();

        try {
            System.out.println("Reading JSON file from Java program");
            FileReader fileReader = new FileReader(file);
            JSONObject json = (JSONObject) parser.parse(fileReader);

            String title = (String) json.get("title");
            String author = (String) json.get("author");
            long price = (long) json.get("price");

            System.out.println("title: " + title);
            System.out.println("author: " + author);
            System.out.println("price: " + price);

            JSONArray characters = (JSONArray) json.get("characters");
            Iterator<?> i = characters.iterator();

            System.out.println("characters: ");
            while (i.hasNext()) {
                System.out.println(" " + i.next());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void createFile() {
    	
    }

}
