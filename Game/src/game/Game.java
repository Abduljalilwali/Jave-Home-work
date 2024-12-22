
package Game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
            System.out.println("Enter a number:");
            Scanner MrAJ = new Scanner(System.in);
            int n = MrAJ.nextInt();
            
            if( n%2 ==0)
                System.out.println("the number is even.");
            
            if( n%2 ==1)
                System.out.println("the number is odd.");
    }
    
}
