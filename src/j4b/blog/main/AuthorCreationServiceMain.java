package j4b.blog.main;

import j4b.blog.object.Author;
import j4b.blog.service.AuthorService;
import j4b.blog.service.AuthorServiceImpl;

public class AuthorCreationServiceMain {

	public static void main(String[] args) {
		
		AuthorService authorService = new AuthorServiceImpl();
		
		Author newAuthor = authorService.createAuthor(13,"Vaclav Havel", "vaclav");
		
		System.out.println(newAuthor + " created");

	}

}
