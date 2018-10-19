package j4b.lab3.main;

import j4b.lab3.object.ThisAsAttribute;

public class ThisExample {

	public static void main(String[] args) {
		
		ThisAsAttribute obj = new ThisAsAttribute(1, -2);
		
		System.out.println("\nGet values form outside:");
		System.out.println("x = " + obj.getX() + ", y = " + obj.getY());

	}

}
