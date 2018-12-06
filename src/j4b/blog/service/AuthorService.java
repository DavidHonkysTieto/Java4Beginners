package j4b.blog.service;

import j4b.blog.object.Author;

public interface AuthorService {
	
	Author createAuthor(int ID, String fullName, String userName);

}
