
package multiplicationtable;

public class MultiplicationTable {

    public static void main(String[] args) {
        
       
        
        for(int i=1; i<=10; i++){
            
            System.out.println("   "+i+" Multiplication Table: ");
            
            for(int j=1; j<=10; j++)
                System.out.println(j+"*"+i +" ="+(i*j)+"  ");
            
        }
    }
    
}