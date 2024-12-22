
package fibonaccinumber;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        
        System.out.print("Enter a positive integer: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        
        int result = 0;
        int f1 =0;
        int f2 =1;
         
        for(int i=1; i<=num; i++){
            result = f1+f2;
            f1=f2;
            f2 = result;
            
        }
        System.out.println("result: "+ result);
            
        
                
    }
    
}
