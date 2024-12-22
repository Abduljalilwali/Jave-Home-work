
package palindromestrings;

import java.util.Scanner;

public class PalindromeStrings {

    public static void main(String[] args) {
        
        Scanner text = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String str = text.nextLine();
        
        String reverse = "" ;
        
        for( int i= str.length()-1; i>=0; i--)
            reverse += str.charAt(i);
            if( reverse.equals(str) )
                System.out.println(str+" is a palindrome string.");
            else
                System.out.println(str+" is not palimdrome string.");
    }
    
}
