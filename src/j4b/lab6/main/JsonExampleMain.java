package j4b.lab6.main;

import j4b.lab6.json.JsonUtils;

public class JsonExampleMain {
	
	public static void main(String args[]) {

        // generate JSON String in Java
		JsonUtils.writeJson("c:\\temp\\book.json");

        // let's read
		JsonUtils.readJson("c:\\temp\\book.json");
    }

}




