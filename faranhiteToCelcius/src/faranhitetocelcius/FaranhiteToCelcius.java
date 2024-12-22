 
package faranhitetocelcius;

import java.util.Scanner;

public class FaranhiteToCelcius {

    public static void main(String[] args) {
        
        System.out.println("Enter Temprature Degree in Faranhite: ");
        
        Scanner f = new Scanner(System.in);
        double faranhite = f.nextDouble();
        
        double celcius;
        celcius = (5*(faranhite-32))/9;
        
        System.out.println( faranhite+" is equal to "+celcius+" celcius degrees.");
    }
    
}
