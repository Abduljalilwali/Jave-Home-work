
package numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        
        Random r = new Random();       
        int randomNumber = r.nextInt(100) + 1;
        System.out.println("The random number is" +" "+ randomNumber );
        
         
        
        int tryCount = 0;
        while(true){
        
            System.out.println("Enter your Guess (1-100):");
            Scanner s = new Scanner(System.in);
            int PlayerGuess = s.nextInt();
            
            tryCount++;

            if( randomNumber == PlayerGuess ){
                System.out.println("You win!");
                System.out.println("It took you" +" "+ tryCount +" "+ "tries.");
                break;
            }
            else if(randomNumber < PlayerGuess ){
                System.out.println("No! The number is lower. Guess again!");
            }
            else if( randomNumber > PlayerGuess ){
                System.out.println("NO! The number is higher. Guess again!");
            }
        }
    }
    
}
