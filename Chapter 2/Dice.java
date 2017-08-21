public class Dice {
	
  	public static void main(String[] args){
		
	  	  int die1, die2;
		    die1 = (int) Math.floor(Math.random() * 6) + 1;
		    die2 = (int) Math.floor(Math.random() * 6) + 1;
		    System.out.println("First Die: " + die1);
		    System.out.println("Second Die: " + die2);
		    System.out.println("Sum of dice results: " + (die1 + die2));
	  }
}

