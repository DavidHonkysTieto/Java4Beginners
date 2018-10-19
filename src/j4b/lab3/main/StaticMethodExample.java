package j4b.lab3.main;

import j4b.lab3.object.Output;

public class StaticMethodExample {

	public static void main(String[] args) {
		   
		   System.out.println("Main method strated...");
		   
		   int result = 0;
		        
		   result = square(3);
		   System.out.println("Square of 3 is: " + result);
		   
		   // Static usage
		   result = square(4); 
		   System.out.println("Square of 4 is: " + result);

		   // Static usage
		   result = Output.square(5); 
		   System.out.println("Square of 5 is: " + result);

		   // Non-static usage
		   Output obj = new Output();
		   obj.myMethod();
		   
		   System.out.println("Method was executed successfully!");
		   
	}

	static int square(int i) {
		return i * i;
	}

}
