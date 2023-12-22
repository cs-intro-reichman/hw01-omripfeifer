public class Coins {
	public static void main(String [] args){
		
	int coins = Integer.parseInt(args[0]);

	// Calculate the number of quarters and cents	
	int quarters = coins / 25; 
	int cent = coins % 25;
		
	// print result
	System.out.println("Use " + quarters + " quarters and " + cent + " cents");
	}
}
