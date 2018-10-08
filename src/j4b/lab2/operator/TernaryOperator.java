package j4b.lab2.operator;

/**
 * Ternary operator as alternative to logical operator
 */
public class TernaryOperator {
	
    public static void main(String[] args) {
    	
    	int februaryDays = 29;
    	String result;
    	
    	result =  (februaryDays == 28) ? "Not a leap year" : "Leap year";
    	System.out.println(result);
    }
    
}
