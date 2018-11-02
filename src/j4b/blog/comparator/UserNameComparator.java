package j4b.blog.comparator;

import java.util.Comparator;

import j4b.blog.object.User;

public class UserNameComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		
		 String name1 = o1.getUserName();
		 String name2 = o2.getUserName();
		 
		 // ascending order (descending order would be: name2.compareTo(name1))
		 return name1.compareTo(name2);

	}

}
