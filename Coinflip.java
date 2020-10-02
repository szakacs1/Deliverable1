import java.util.Scanner;
import java.util.Random;
public class Coinflip {
	
		
	public static void main(String[] args0) {
		
		
		System.out.println("Guess which will have more: heads or tails?");
		Scanner scnr = new Scanner(System.in);
		String headsOrTailsGuess = scnr.nextLine();
		
		Scanner scnn = new Scanner(System.in);
	    System.out.print("How many times do you want to flip the coin? ");
	    int numberOfFlips = scnn.nextInt();
	    Random randomNum = new Random();
	    

	    for (int i=0; i < numberOfFlips; i++) {
	        int currentflip = randomNum.nextInt(2);
	        int previousFlip = 0;
	        int tailsCount = 0;
	        int headsCount = 0;
	        int correctCount = 0;
	        
	        if (currentflip == 0) {
	            System.out.print(" Heads");
	            previousFlip = 0;
	            headsCount++;
	            
	        }
	        else if (currentflip == 1) {
	            System.out.print(" Tails");
	            previousFlip = 1;
	            tailsCount++;
	            
	        }

	        if (previousFlip == 0 && currentflip == 1) {
	            System.out.print(headsCount + " ");
	            headsCount = 0;
	        }
	        else if (previousFlip == 1 && currentflip == 0){
	            System.out.print(tailsCount + " ");
	            tailsCount = 0;
	        
	            System.out.println("Heads = " + headsCount +  " Tails = " + tailsCount);
	            
	            int percent = (correctCount/numberOfFlips)*100;
	    		System.out.println("Your percent correct is:" + percent);
	        }
	        {
	        }
	        
	        }
	        	
	        	{
	        
	        	}
	     
	    }
}
	

	    
	


	        