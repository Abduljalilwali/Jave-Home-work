
package luckynamber;

import java.util.Scanner;

public class LuckyNamber {

    public static void main(String[] args) {
        
        
        System.out.println("Enter a four digit number:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int firstDigit = n%10;
        int secondDigit = (n/10)%10;
        int thirdDigit = (n/100)%10;
        int fourthDigit = (n/1000)%10;
        
        if( firstDigit+secondDigit == thirdDigit+fourthDigit )
            System.out.println("This is a Lucky number.");
        else 
            System.out.println("This is not a Lucky number.");   
    }
    
}
