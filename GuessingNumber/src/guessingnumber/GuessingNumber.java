
package guessingnumber;

import java.util.Random;

public class GuessingNumber {

    public static void main(String[] args) {
        
      Random rand = new Random();
    
      Scannar Scannar;
        Scannar = new Scannar(System.in);
      
      int randomNumber = rand.nextInt(100) +1 ;
      
      System.out.println("The random number is" + randomNumber);
      
      System.out.println("Enter your guess (1-100):");
      
      int playerGuess = Scannar.nextInt();
           if (playerGuess == randomNumber) {
          System.out.println("Correct! You Win!");
      }
      else if (randomNumber > playerGuess){
          System.out.println("Nope the number is higher.Guess again.");
      }
      else  {
          System.out.println("Nope the number is lower.Guess again.");
      }
      
    }
    
}
