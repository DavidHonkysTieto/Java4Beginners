package j4b.blog.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import j4b.blog.object.Author;

public class AuthorServiceImpl implements AuthorService {
	
	final static Logger logger = Logger.getLogger(AuthorServiceImpl.class);
	
	JSONParser parser = new JSONParser();
	
	@SuppressWarnings("unchecked")
	@Override
	public Author createAuthor(int ID, String fullName, String userName) {
		
		logger.debug("Trying to create Author: " + fullName);
		
		try {			
			
			JSONObject author = new JSONObject();
			author.put("id", ID);
			author.put("fullName", fullName);
			author.put("userName", userName);
	        
	        JSONArray jsonArray = readAuthorsFile();
	        jsonArray.add(author);
	        
	        JSONObject authors = new JSONObject();
	        authors.put("authors", jsonArray);
	        
	        FileWriter jsonFileWriter = new FileWriter(getAuthorsFile());
			
			jsonFileWriter.write(authors.toJSONString());
			
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
			System.out.println("Nenasel jsem soubor.");
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
