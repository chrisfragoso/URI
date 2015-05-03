
package iniciante;

import java.util.Scanner;
import java.util.Locale;

public class lanche {
     public static void main (String[] args){
         
         Scanner s = new Scanner(System.in);
         Locale.setDefault(Locale.US);
         
         int code, qtd;
         double total = 0;
               
         System.out.printf("Código do lanche: \n");
         code = s.nextInt();
               
         System.out.printf("Quantidade do lanche: \n");
         qtd = s.nextInt();
               
         if ((code>0) && (code<6)){
                  
         if (code == 1){
             total = qtd*4;
                System.out.printf("Total: R$ %.2f\n", total);
         }
               
         else if (code == 2){
             total = qtd*4.5;
                System.out.printf("Total: R$ %.2f\n", total);
         }
               
         else if (code == 3){
             total = qtd*5;
                System.out.printf("Total: R$ %.2f\n", total);
         }
               
         else if (code == 4){
             total = qtd*2;
                System.out.printf("Total: R$ %.2f\n", total);
         }
               
         else if (code == 5){
             total = qtd*1.5;
                System.out.printf("Total: R$ %.2f\n", total);
         }
             
            
         }
                  
     }    
}
