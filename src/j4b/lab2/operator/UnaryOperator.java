package j4b.lab2.operator;

/**
 * 
 * Unary operator - increments / decrements by 1
 *
 */
class UnaryOperator {
	
    public static void main(String[] args) {
    	
    	double number = 5.2;

    	System.out.println(number++);
    	System.out.println(number);

    	System.out.println(++number);
    	System.out.println(number);
    }
    
}
