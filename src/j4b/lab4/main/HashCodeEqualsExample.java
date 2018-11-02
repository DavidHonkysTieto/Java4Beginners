package j4b.lab4.main;

import java.util.HashSet;
import j4b.blog.object.User;

public class HashCodeEqualsExample {

	public static void main(String[] args) {
		
		User honza = new User(1,"Jan P","honza");
		User david = new User(2,"David H","david");

		HashSet<User> userList = new HashSet<User>();

        userList.add(honza);
        userList.add(david);

        System.out.println("HashSet size = " + userList.size());
        System.out.println("HashSet contains user = " + userList.contains(new User(1,"Jan P","honza")));

	}

}
