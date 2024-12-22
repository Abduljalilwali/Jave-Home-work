
package triangle;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
       
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = x.nextInt();
        
        
        for( int i=1; i<=n; i++){
            
            System.out.println();
            
            for( int j=1; j<=n-i; j++)
                System.out.print(" ");
            
            for( int k=1; k<=2*i-1; k++)
                if( i==n )
                    System.out.print("*");
                else 
                    if( k==1 ||k==2*i-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            
            
        
           
    }
        
    }
}
