
package addingnumbersbymethods;

public class AddingNumbersByMethods {

    
    public static void main(String[] args) {
      System.out.println("The addition of numbers from 1-100 is " + sum(1,100));
      System.out.println("The collection of numbers from 101-200 is " + sum(101,200));
      System.out.println("The collection of numbers from 201-300 is " + sum(201,300));
    }
    public static int sum(int start,int end){
        int result =0;
        for (int num = 1; num <= end; num++) {
            result += num;
        }
        return result;
    }
    
}
