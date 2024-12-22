
package primenumbers;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
            
       
        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        boolean  isPrime =true;
        for( int i =2 ; i<=n/2 ; i++)
            if( n%i==0 )
               isPrime = false;
                
    
        System.out.println(isPrime ? "Prime" : "not Prime");
    }
}

