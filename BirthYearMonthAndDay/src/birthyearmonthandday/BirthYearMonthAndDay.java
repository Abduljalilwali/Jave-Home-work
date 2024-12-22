
package birthyearmonthandday;

import java.util.Scanner;



public class BirthYearMonthAndDay {

    public static void main(String[] args) {
      int OrignalYear = 2024 ;
      int OrignalMonth = 12 ;
      int OrignalDay = 30 ;
      int Year ;
      int Month ;
      int Day ;
      
        Scanner input = new Scanner(System.in);
        
        
      System.out.println("how many years are you?");
      Year = input.nextInt();      
      int BirthYear = (OrignalYear)-(Year);      
    
      
      
      System.out.println(" And how many months?");
      Month = input.nextInt();
      int BirthMonth = (OrignalMonth)-(Month);
      
      
      
      System.out.println("And how many days?");
      Day = input.nextInt();     
      int BirthDay = (OrignalDay)-(Day);     
     
      System.out.println("you are born in" +(BirthYear-1)+" , "+(BirthMonth-1)+" ,"+BirthDay+"." );
      
      
      
    }
    
}
