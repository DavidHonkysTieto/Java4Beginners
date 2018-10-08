package j4b.lab2.operator;

/**
 * Arithmetic operators in usage with double and String type.
 */
class ArithmeticOperator {
	
    public static void main(String[] args) {
    	
    	useDouble();
    	useString();

    }
    
    public static void useDouble() {
    	
    	double number1 = 12.5, number2 = 3.5, result;
    	
    	// Using addition operator
    	result = number1 + number2;
    	System.out.println("number1 + number2 = " + result);
    	
    	// Using subtraction operator
    	result = number1 - number2;
    	System.out.println("number1 - number2 = " + result);
    	
    	// Using multiplication operator
    	result = number1 * number2;
    	System.out.println("number1 * number2 = " + result);

    	// Using division operator
    	result = number1 / number2;
    	System.out.println("number1 / number2 = " + result);
    	
    	// Using remainder operator
    	result = number1 % number2;
    	System.out.println("number1 % number2 = " + result);
    	
    }
    
    public static void useString() {
    	
    	String start, middle, end, output;
    	
    	start = "Talk is cheap. ";
    	middle = "Show me the code. ";
    	end = "- Linus Torvalds";
    	
    	output = start + middle + end;
    	System.out.println(output);
    	
    }
}
