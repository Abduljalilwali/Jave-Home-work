
package hifiveandhitwo;

import java.util.Scanner;

public class HiFiveAndHiTwo {

    public static void main(String[] args) {
        
        System.out.println("Enter a number: ");
        Scanner x = new Scanner(System.in);
        int YourNumber = x.nextInt();
        
        
        if( YourNumber%5==0 )
            System.out.println(YourNumber+" is HiFive!");
        else if( YourNumber%2==0 )
            System.out.println(YourNumber+" is HiTwo!");
        else 
            System.out.println(YourNumber+" is not HiFive niether HiTwo!");
        
                
    }
    
}
