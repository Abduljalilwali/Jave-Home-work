
package lottery;

import java.util.Random;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        
        
        Random rand = new Random();
        int output = rand.nextInt(100);
        System.out.println("The random number is 0"+output);
        
        
        System.out.println("Enter a two digit number: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        
        int randFirstDigit = output%10 ;
        int randSecondDigit = (output/10)%10;
        
       
        int inputFirstDigit = input%10;
        int inputSecondDigit = (input/10)%10;
        
        
        
        if( randFirstDigit==inputFirstDigit && randSecondDigit==inputSecondDigit )
            System.out.println("You won $10000.");
        else if( randFirstDigit==inputSecondDigit && randSecondDigit==inputFirstDigit )
            System.out.println("You won $3000.");
        else if( randFirstDigit==inputFirstDigit && randSecondDigit!=inputSecondDigit || randFirstDigit!=inputFirstDigit && randSecondDigit==inputSecondDigit )
            System.out.println("You won $1000.");
        else
            System.out.println("You lost!");
        
    }
    
}
