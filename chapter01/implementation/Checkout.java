package implementation;

public class Checkout{

 private int runningTotal = 0;

 public int add (int count, int price){
    runningTotal += (count*price);
 }

 public int total(){

 	return runningTotal;
 }




}

