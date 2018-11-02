package j4b.blog.comparator;

import java.time.LocalDateTime;
import java.util.Comparator;

import j4b.blog.object.User;

public class UserCreationComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		
		 LocalDateTime name1 = o1.getCreationDate();
		 LocalDateTime name2 = o2.getCreationDate();
		 
		 // ascending order (descending order would be: name2.compareTo(name1))
		 return name1.compareTo(name2);

	}

}
