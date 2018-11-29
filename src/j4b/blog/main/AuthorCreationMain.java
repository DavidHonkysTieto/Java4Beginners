package j4b.blog.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import j4b.blog.comparator.UserNameComparator;
import j4b.blog.object.Author;

public class AuthorCreationMain {

	public static void main(String[] args) {		
		
		List<Author> authors = Arrays.asList(
				new Author(1,"Leonardo Da Vinci", "leonardo"),
				new Author(2,"Freddie Mercury","freddie"),
				new Author(3,"Bono Vox","bono"),
				new Author(4,"Cristiano Ronaldo","strelec"),
				new Author(5,"Usian Bolt","bezec")
				);
		
		Collections.sort(authors, new UserNameComparator());
		
		authors.forEach(author->System.out.println(author));

	}

}
