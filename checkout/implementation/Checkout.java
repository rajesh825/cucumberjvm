package implementation;

public class Checkout{ 
    private int runningTotal = 0;

    public void add(int count, int price) {
	    System.out.println("count " + count + "price " + price);
            runningTotal += (count * price);
	    System.out.println("Running Total : " + runningTotal); 
    }

    public int total(){
	  return runningTotal;
    }	  
}	
