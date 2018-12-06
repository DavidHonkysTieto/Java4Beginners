package j4b.lab6.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExampleExceptionsMain {

	public static void main(String[] args) {
		simulateNullPointerException();
		simulateIndexOutOfBoundsException();
		simulateFileNotFoundException();
		simulateNumberFormatException();
	}
	
	public static void simulateNullPointerException() {
		try { 
            String a = null; //null value 
            System.out.println(a.charAt(0)); 
        } catch(NullPointerException e) { 
            System.out.println("NullPointerException...");
            e.printStackTrace();
        } 
	}
	
	public static void simulateIndexOutOfBoundsException() 
    { 
        try { 
            String a = "This is like chipping "; // length is 22 
            char c = a.charAt(24); // accessing 25th element 
            System.out.println(c); 
        } 
        catch(StringIndexOutOfBoundsException e) { 
            System.out.println("StringIndexOutOfBoundsException...");
            e.printStackTrace();
        } 
    }
	
	public static void simulateFileNotFoundException() 
    { 
		try {			  
            File file = new File("C://file.txt"); 
  
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) { 
           System.out.println("File does not exist..."); 
        } 
    }
	
	public static void simulateNumberFormatException() 
    { 
		
		int num = -1;
		
		try { 
            // "id" is not a number
			String cislo = "text";
            num = Integer.parseInt (cislo) ; 
  
            System.out.println(num); 
        } catch(NumberFormatException e) { 
            System.out.println("Number format exception...");
            e.printStackTrace();
            num = 1;
            
        }
		
		num++;
		
    }

}
