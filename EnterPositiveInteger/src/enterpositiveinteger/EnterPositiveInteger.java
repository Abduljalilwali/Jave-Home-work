
package enterpositiveinteger;

import java.util.Scanner;

public class EnterPositiveInteger {

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        int x = s.nextInt();
        
        int max = x; 
        int min = x;
        
            
        if( x>=0 ){
            while(true){
                x = s.nextInt();

                if( x<0 )
                break;

                max = x>max ? x: max;
                min = x<min ? x: min;
        
        
        }   
        System.out.println("max "+max+", min "+min );
        }
        else
            System.out.println(x+" is Invalid ");             
    }
    
}
