
package favoritenumber;

import java.util.Scanner;

public class FavoriteNumber {

    public static void main(String[] args) {
        System.out.print("Enter your favorite integer: ");
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println( n + " is my favorite number too!");
        
    }
    
}
