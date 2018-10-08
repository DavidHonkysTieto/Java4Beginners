package j4b.lab2.operator;

/**
 * 
 * Logical true/false operator
 *
 */
public class LogicalOperator {
	
    public static void main(String[] args) {
    	
    	int number1 = 1, number2 = 2, number3 = 9;
    	boolean result;
    	
    	// At least one expression needs to be true for result to be true
    	result = (number1 > number2) || (number3 > number1);
    	System.out.println(result);
    			
    	// All expression must be true from result to be true	
    	result = (number1 > number2) && (number3 > number1);
    	System.out.println(result);
    }
    
}