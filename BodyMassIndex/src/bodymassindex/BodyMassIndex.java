
package bodymassindex;

import java.util.Scanner;


public class BodyMassIndex {

    public static void main(String[] args) {
       
        System.out.println("Enter your weight in kg: ");
        Scanner s = new Scanner(System.in);
        double weight = s.nextDouble();
        System.out.println("Now Enter your hight in meters: ");
        double hight = s.nextDouble();
        
        
        double BMI;
        BMI = weight/( Math.pow(hight,2));
        
        if( BMI<18.5 )
            System.out.println("You are UnderWeight.");
        else if( BMI <25.0 )
            System.out.println("You are Normal.");
        else if( BMI < 30.0 )
            System.out.println("You are OverWeight.");
        else {
            System.out.println("You are Obese.");
        }
            
        
    }
    
}
