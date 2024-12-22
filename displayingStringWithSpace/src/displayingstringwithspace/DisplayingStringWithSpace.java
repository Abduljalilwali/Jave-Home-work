
package displayingstringwithspace;

import java.util.Scanner;

public class DisplayingStringWithSpace {

    public static void main(String[] args) {
        
        System.out.print("Enter your text: ");
        Scanner text = new Scanner(System.in);
        String str = text.nextLine();
        
        for( int i = 0; i<= str.length()-1; i++)
            System.out.print( str.charAt(i)+" ");
    }
    
}
