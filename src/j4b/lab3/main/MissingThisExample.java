package j4b.lab3.main;

public class MissingThisExample {
	
	int instanceVariable;
	boolean isInstanceVariable;
	
	MissingThisExample(int instanceVariable){
		instanceVariable = instanceVariable;
    }
    
	MissingThisExample(int instanceVariable, boolean isInstanceVariable){
        this.instanceVariable = instanceVariable;
        this.isInstanceVariable = isInstanceVariable;        
    }

	public static void main(String[] args) {
		
		MissingThisExample objMissing = new MissingThisExample(8);
        System.out.println("Missing this: " + objMissing.instanceVariable);
        
        MissingThisExample objFine = new MissingThisExample(8,true);
        System.out.println("Not missing this: " + objFine.instanceVariable);
        
	}

}
