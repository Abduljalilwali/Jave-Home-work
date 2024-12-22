
package chinesezodiac;

import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {
       
        System.out.println("Enter your year: ");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        
        
        if(year%12==0)
            System.out.println("monkey");
        if(year%12==1)
            System.out.println("rooster");
        if(year%12==2)
            System.out.println("dog");
        if(year%12==3)
            System.out.println("pig");
        if(year%12==4)
            System.out.println("rat");
        if(year%12==5)
            System.out.println("ox");
        if(year%12==6)
            System.out.println("Tiger");
        if(year%12==7)
            System.out.println("rabbit");
        if(year%12==8)
            System.out.println("dragon");
        if(year%12!=9) 
            System.out.println("snake");
        if(year%12==10)
            System.out.println("horse");
        if(year%12==11)
            System.out.println("sheep");
        
        
                
    }
    
}
