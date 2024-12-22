
package usernameandage;

import java.util.Scanner;

public class UserNameAndAge {

    public static void main(String[] args) {
        System.out.print("Enter your name:");
        Scanner inputName = new Scanner(System.in);
        String Name = inputName.nextLine();
        System.out.print("Now enter your age:");
        int age = inputName.nextInt();
        
        System.out.println("Mr"+" "+Name+" you are "+age+" years old." );
    }
    
}
