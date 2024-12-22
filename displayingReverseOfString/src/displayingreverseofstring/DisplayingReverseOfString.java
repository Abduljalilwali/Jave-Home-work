
package displayingreverseofstring;

import java.util.Scanner;

public class DisplayingReverseOfString {

    public static void main(String[] args) {
        
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = str.nextLine();
        String reverse ="";
        
        for( int i=text.length()-1; i>=0; i--)
            reverse += text.charAt(i);
            
        
        System.out.print("The reverse of the string "+text+" is "+reverse);
    }
    
}
