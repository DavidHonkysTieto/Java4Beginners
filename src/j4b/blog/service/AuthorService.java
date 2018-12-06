package j4b.blog.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import j4b.blog.object.Author;

public class AuthorService {
	
	JSONParser parser = new JSONParser();
	
	@SuppressWarnings("unchecked")
	public Author createAuthor(int ID, String fullName, String userName) {		
		
		try {			
			
			JSONObject author = new JSONObject();
			author.put("id", ID);
			author.put("fullName", fullName);
			author.put("userName", userName);
	        
	        JSONArray jsonArray = readAuthorsFile();
	        jsonArray.add(author);
	        
	        FileWriter jsonFileWriter = new FileWriter(getAuthorsFile());
			
			jsonFileWriter.write(jsonArray.toJSONString());
			
			jsonFileWriter.flush();
			jsonFileWriter.close();
			
		} catch (IOException e) {
			System.out.println(" Nepodarilo se zapsat data do JSON souboru. ");
			e.printStackTrace();
		}
		
		return new Author(ID, fullName, userName);
	}
	
	private JSONArray readAuthorsFile() {
		
		FileReader fileReader;
		JSONArray authors = null;
		
		try {
			
			fileReader = new FileReader(getAuthorsFile());
			
			JSONObject json = (JSONObject) parser.parse(fileReader);
			
			authors = (JSONArray) json.get("authors");
			
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return authors;
	
	}
	
	private File getAuthorsFile() {
		return new File("data/authors.json");
	}

}
