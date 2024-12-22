
package userinput;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        
        System.out.println("What's your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        
        System.out.println("How old are you?");
        int age = s.nextInt();
        s.nextLine();
        
        System.out.println("Which is your favorite food?");
        String favoriteFood = s.nextLine();
        
        System.out.println("Your name is "+name);
        System.out.println("You are "+age+" years age.");
        System.out.println("You like "+favoriteFood);
    }
    
}
