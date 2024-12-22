
package learning;

import java.util.Scanner;

public class Java {

    public static void main(String[] args) {
      System.out.println("Enter a number :");
      
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        if( n%2 == 0)
            System.out.println("This is an even number");
        
        if( n%2 == 1)
            System.out.println("This is an odd number");          
    }
    
}
