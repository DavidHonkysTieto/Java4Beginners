package j4b.lab4.main;

import java.util.ArrayList;
import java.util.List;

import j4b.blog.object.User;

public class EqualsListExample {

	public static void main(String[] args) {
		
		User honza = new User(1,"Jan P","honza");
		User david = new User(2,"David H","david");

        List <User> userList = new ArrayList<User>();

        userList.add(honza);
        userList.add(david);

        System.out.println("Arraylist size = " + userList.size());
        System.out.println("Arraylist contains user = " + userList.contains(new User(1,"Jan P","honza")));

	}

}
