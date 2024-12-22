
package computecirclearea;

import java.util.Scanner;

public class ComputeCircleArea {

    public static void main(String[] args) {
        System.out.println("Enter a radius:");
        Scanner a = new Scanner(System.in);
        double r = a.nextDouble();
        
        double A = r*r*3.1459;
        
        System.out.println("The Area is equal to" +" "+ A );
        
        
    }
    
}
