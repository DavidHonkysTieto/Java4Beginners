package j4b.lab4.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEachExample {

	public static void main(String[] args) {
	
		//  Iterating over a Collection (List)
		List<String> names = Arrays.asList("Larry", "Steve", "James");		 
		names.forEach(System.out::println);
		System.out.println();
		
		//  Iterating over a Collection (Set)
		Set<String> uniqueNames = new HashSet<>(Arrays.asList("Larry", "Steve", "James"));		 
		uniqueNames.forEach(System.out::println);
		System.out.println();
		
		// Iterating over a Map
		Map<Integer, String> namesMap = new HashMap<>();
		namesMap.put(1, "Larry");
		namesMap.put(2, "Steve");
		namesMap.put(3, "James");
		namesMap.forEach((key, value) -> System.out.println(key + " " + value));
		System.out.println();
		
		// External Iterator – for-loop
		for (String name : names) {
		    System.out.println(name);
		}
	
	}
}
