
package calculators;

import java.util.Scanner;

public class Calculators {

    public static void main(String[] args) {
        System.out.println("Enter num1 op num2:");
        
        
        
        Scanner s = new Scanner(System.in);        
        double a = s.nextDouble();
        char op = s.next().charAt(0);
        double b = s.nextDouble();
        
        
        if( op == '+')
            System.out.println( a+b );
        else if( op == '-')
            System.out.println( a-b );
        else if( op == '*')
            System.out.println( a*b );
        else if( op == '/')
            System.out.println( a/b );
        else if( op == '%')
            System.out.println( a%b );
        else if( op == '^')
            System.out.println( Math.pow(a, b));
        else
            System.out.println("Invalid enterance!!!");
    }
    
}
