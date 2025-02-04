import java.util.Scanner;
import java.util.Random;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author itlabs
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean tryAgain = true;
        
        while(tryAgain) {
            int numberGuess = random.nextInt(100) + 1;
            int numTries = 0;
            boolean gussedCorrect = false;
            
            System.out.println("Welcome to the Number Gussing Game!");
            System.out.println("I have selected a number between 1 and 100. Can you guess it?");
            
            while(numTries < 5 && !gussedCorrect){
                System.out.print("Enter your guess ");
                int userGuess = scanner.nextInt();
                numTries++;
                
                if(userGuess < numberGuess) {
                    System.out.println("Too low, try again");
                }
                else if (userGuess > numberGuess){
                    System.out.println("Too high, try again");
                }
                else{
                    System.out.println("Congratulations! You've gussed the correct number");
                    gussedCorrect = true;
                }   
               }
            if(!gussedCorrect) 
            {
                System.out.println("Sorry, you've used all your attempts. The correct number was "+ numberGuess);
            }
           
        }
        
        System.out.println("Thank you for playing!");
    }
    
}
