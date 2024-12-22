
package maxvalue;

import java.util.Scanner;

public class MaxValue {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter number one: ");
        int num1 = s.nextInt();
        System.out.println("Enter number two: ");
        int num2 = s.nextInt();
        int value =max( num1,num2);
        
        System.out.println("The maximum between "+num1+" and "+num2+" is "+value);
        
    }      
        
        public static int max (int num1 , int num2){
            int result;
            
            if (num1>num2)
                result = num1;
            else
                result = num2;
            
            return result;
        }
    }
    

