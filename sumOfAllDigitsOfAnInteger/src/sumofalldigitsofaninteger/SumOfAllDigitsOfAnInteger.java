
package sumofalldigitsofaninteger;

import java.util.Scanner;

public class SumOfAllDigitsOfAnInteger {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        
        int sum = 0;
        
        while( number > 0){
            
        
            sum += number%10;
            number /= 10;
        }
            System.out.println("sum is "+ sum);
    }
        
}
