
package iniciante;

import java.util.Scanner;

public class intervalo{ 
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double P;
        
        P = s.nextDouble();
       
        
        if ((P>=0) && (P<=100)){
        
         if ((P>=0) && (P<=25)){
             
             System.out.printf("Intervalo [0,25]\n");
         }
        
         else if ((P>25) && (P<=50)) {          
       
        System.out.printf("Intervalo (25,50]\n");
        }
         
         else if ((P>50) && (P<=75)) {
        
        System.out.printf("Intervalo (50,75]\n");
             
         }
         
         else if ((P>75) && (P<=100)) {
        System.out.printf("Intervalo (75,100]\n");
        }
        
         
    
         
        
        }
        else System.out.printf("Fora de intervalo\n");
    }
}