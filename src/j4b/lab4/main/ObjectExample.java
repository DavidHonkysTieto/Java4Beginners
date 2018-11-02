package j4b.lab4.main;

import j4b.blog.object.Person;
import j4b.blog.object.User;

public class ObjectExample {

	public static void main(String[] args) {

		// toString
		
		Person person = new Person(1,"Alex");		
		System.out.println("\n" + person.toString());
		
		User user1 = new User(1,"David H","david");		
		System.out.println("\n" + user1.toString());
		
		
		// equals
		
		User user2 = new User(1,"David H","david");
		System.out.println("\n" + "Checking equality between user1 and user2 = " + user1.equals(user2));
		
		
		// hashcode

		System.out.println("\n" + "user1 hashcode = " + user1.hashCode());
		System.out.println("\n" + "user2 hashcode = " + user2.hashCode());
		
	}

}
