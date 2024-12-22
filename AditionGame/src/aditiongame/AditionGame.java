
package aditiongame;

import java.util.Random;
import java.util.Scanner;

public class AditionGame {

    public static void main(String[] args) {
        
        
        Random rand = new Random();
        int randomNumber1 = rand.nextInt(120);
        int randomNumber2 = rand.nextInt(120);
        System.out.println( randomNumber1+" "+ "+" +" "+randomNumber2 );
        
        
        
        
        int tryCount = 0;
        while(true){
            
            
        Scanner s = new Scanner(System.in);
        System.out.println("What shall be the Sum?");
        int sum = s.nextInt();
        
        tryCount++;
        
        
        if( sum == randomNumber1+randomNumber2 ){
            System.out.println("You got it!");
            if( tryCount == 1 )
            System.out.println("It took you one try!");           
            if( tryCount>=2 )    
            System.out.println("It took you" +" "+ tryCount+" "+ "tries!");
            break;
        }
        else{
            System.out.println("NO,you need to think more and Guess again.");
        }
        }
    }
    
}
