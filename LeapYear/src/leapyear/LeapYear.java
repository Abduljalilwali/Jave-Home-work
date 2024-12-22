
package leapyear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
       
        System.out.println("Hi! Enter an integer year:");
        Scanner s = new Scanner(System.in);
        int Year = s.nextInt();
        
        if( Year%4==0 && Year%100!=0 || Year%400==0 )
            System.out.println(Year+" is a leap year.");
        else 
            System.out.println(Year+" is not a leap year.");
    }
    
}
