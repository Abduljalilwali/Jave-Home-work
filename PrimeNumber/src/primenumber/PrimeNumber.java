
package primenumber;

public class PrimeNumber {

  
    public static void main(String[] args) {
      int count = 0;
      int odd = 2;
      while (count < 50){
          boolean prime = true ;
          for (int i = 2; i*i <=odd; i++) {
              if (odd % i == 0) {
                  prime = false;
                  break;
              }
          }
          if (prime){
              System.out.print(odd+"\t");
              count++;
              if (count % 10 == 0) {
                  System.out.println();
              }
          }
          odd++;
      }
    }
    
}
