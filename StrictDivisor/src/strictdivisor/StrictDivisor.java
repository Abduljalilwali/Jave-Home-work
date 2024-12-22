
package strictdivisor;

import java.util.Scanner;

public class StrictDivisor {

    public static void main(String[] args) {
       
        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int sum = 0;
        
        for (int  i=1 ; i<= input/2; i++)
            if ( input%i == 0)
               
        System.out.print( i+" " );
            
    }
    
}
