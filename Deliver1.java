
import java.util.Scanner;

public class DeliverableOn	 {
   

    private static Scanner scanner = new Scanner(System.in);

    

    public static void main(String[] args) {
        System.out.println("Enter a password");
        String password = scanner.nextLine();   

        checkPassword(password);
    }
   
    public static boolean checkPassword(String password){
        boolean upperCase = !password.equals(password.toLowerCase()); 
        boolean lowerCase = !password.equals(password.toUpperCase()); 
        boolean isAtLeast7 = password.length()>=7;                    
        boolean hasSpecial = !password.matches("[!]");       
        boolean isAtMost12 = password.length()<=12;          
        if(!isAtLeast7){
            System.out.println("Error. Enter a password with minimun of 7 characters");
            return true;
        }else if(!isAtMost12) {
        	System.out.println("Error. Enter a password with maximum of 12 characters");
        	return true;
        }else if(!upperCase){
            System.out.println("Error. Password must contain at least one uppercase letter");
            return true;
        }else if(!lowerCase){
            System.out.println("Error. Password must contain at least one lower case letter");
            return true;
        }else if(!hasSpecial){
            System.out.println("Error. Password must contain a special character");
            return true;
        
        }else{
            System.out.println("Password valid and accepted");
            return true;
        }

    }
}

