package j4b.lab6.main;

import j4b.lab6.exception.CustomExceptionWithMessage;
import j4b.lab6.exception.CustomExceptionWithoutMessage;

public class CustomExceptionMain {

	public static void main(String args[]) {

		try {
			// Throw an object of user defined exception
			throw new CustomExceptionWithMessage("Java4Beginners");
		} catch (CustomExceptionWithMessage ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
		
		System.out.println();

		try {
			// Throw an object of user defined exception
			throw new CustomExceptionWithoutMessage();
		} catch (CustomExceptionWithoutMessage ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}

	}

}
