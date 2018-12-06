package j4b.blog.main;

import j4b.blog.object.Author;
import j4b.blog.service.AuthorService;

public class AuthorCreationServiceMain {

	public static void main(String[] args) {
		
		AuthorService authorService = new AuthorService();
		
		Author newAuthor = authorService.createAuthor(6,"Donald Trump", "donald");
		
		System.out.println(newAuthor + " created");

	}

}
