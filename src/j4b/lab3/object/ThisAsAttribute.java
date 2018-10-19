package j4b.lab3.object;

public class ThisAsAttribute {
	
	private int x = 0;
    private int y = 0;

    public ThisAsAttribute(int x, int y) {
    	
        this.x = x;
        this.y = y;
        
        System.out.println("Before passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
        
        addTwo(this);
        
        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }

    public void addTwo(ThisAsAttribute o){
        o.x += 2;
        o.y += 2;
    }

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}    

}
