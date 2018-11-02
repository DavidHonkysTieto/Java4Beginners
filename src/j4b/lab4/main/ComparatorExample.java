package j4b.lab4.main;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import j4b.blog.comparator.UserCreationComparator;
import j4b.blog.comparator.UserNameComparator;
import j4b.blog.object.User;

public class ComparatorExample {

	public static void main(String[] args) {
		
		// Compare names
		
		List<User> people = Arrays.asList(
				new User(1,"David H","david"),
				new User(2,"Jan P","honza"),
				new User(3,"Bono Vox","bono"),
				new User(4,"Cristiano Ronaldo","strelec"),
				new User(5,"Usian Bolt","bezec")
        );
		
		System.out.println("Before sorting...");
		people.forEach(System.out::println);

		Collections.sort(people, new UserNameComparator());
		
		System.out.println("\nAfter sorting...");
		people.forEach(System.out::println);

		
		// Compare dates
		
		List<User> dates = Arrays.asList(
				new User(1,"David H","david", LocalDateTime.of(2018, 2, 2, 1, 1)),
				new User(2,"Jan P","honza", LocalDateTime.of(2017, 1, 1, 1, 1)),
				new User(3,"Bono Vox","bono", LocalDateTime.of(2018, 5, 5, 5, 5)),
				new User(4,"Cristiano Ronaldo","shooter", LocalDateTime.of(2018, 1, 1, 5, 5)),
				new User(5,"Usian Bolt","runner", LocalDateTime.of(2015, 12, 12, 10, 0))
				);
		
		System.out.println("Before sorting...");
		dates.forEach(System.out::println);
		
		Collections.sort(dates, new UserCreationComparator());
		
		System.out.println("\nAfter sorting...");
		dates.forEach(System.out::println);

		
	}

}
