

package iniciante;

import java.util.Scanner;

public class TipodeCombustivel {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int cod, a=0,g=0,d=0;
        
        //System.out.printf("1.Álcool 2.Gasolina 3.Diesel 4.Fim\n");
      
       do{  
           
            cod = s.nextInt();
            
            
            switch(cod){
                case 1:
                    a++;
                    break;
                case 2:
                    g++;
                    break;
                case 3:
                    d++;
                    break;
                case 4:{
                    System.out.printf("MUITO OBRIGADO\n");
                    System.out.printf("Alcool: %d\n",a);
                    System.out.printf("Gasolina: %d\n",g);
                    System.out.printf("Diesel: %d\n",d);
                }
                
                    System.exit(0);  
            }
                
       }while(cod>=0);
      
    
    }
    
    
}
