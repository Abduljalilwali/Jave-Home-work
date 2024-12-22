
package numbertriangle;

import java.util.Scanner;

public class Numbertriangle {

    public static void main(String[] args) {
        
        System.out.println("Enter the amount of rows: ");
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        
        
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print(i);        
        System.out.println();
        }
        
    } 
}
