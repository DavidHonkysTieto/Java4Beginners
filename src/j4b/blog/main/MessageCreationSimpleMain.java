package j4b.blog.main;

import j4b.blog.object.Author;
import j4b.blog.object.Message;

public class MessageCreationSimpleMain {

	public static void main(String[] args) {
		
		Author author = new Author(1,"Leonardo Da Vinci", "leonardo");
		
		String content = "Obsah prvni zpravy";
		
		Message message = new Message(author, content);
		
		System.out.println(message);
		
	}

}
