import java.util.Scanner;

public class Coinflip {
	
		
	public static void main(String[] args0) {
		
		
			String headsOrTailsGuess = "";

		    int numberOfFlips = 0;
		    int correctCount = 0;
	        int tailsCount = 0;
	        int headsCount = 0;
	        int correctCount1 = 0;
	        int l = 0; 
	      
	        Scanner scnr = new Scanner(System.in);
			System.out.println("Guess which will have more: heads or tails?");
			headsOrTailsGuess = scnr.next();
			
		    System.out.print("How many times do you want to flip the coin? ");
		    numberOfFlips = scnr.nextInt();
		    Random randomNum = new Random();
	        
	        if (headsCount == 0) {
				while (numberOfFlips > l) {
					int rand = (int) Math.round(Math.random());
					if (rand % 2 == 0.0) {
						System.out.println("heads");
						correctCount1++;
						l++;
						} else {
						System.out.println("tails");
						l++;
				}
			}
				} else if (tailsCount == 0) {
				while (numberOfFlips > l) {
					int rand = (int) Math.round(Math.random());
					if (rand % 2 == 0.0) {
						System.out.println("heads");
						l++;
						} else {
						System.out.println("tails");
						correctCount1++;
						l++;
				}
			}
				} else {
				String x = "Guess heads or tails only.";
				System.out.println(x);
			}
			
			System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount1 + " time(s).");
			System.out.println("That's " + correctCount1 * 100 / numberOfFlips + "%.");
			scnr.close();
		}
			}

	
	
	
	
	

	    
	


	        
