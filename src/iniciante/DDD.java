
package iniciante;

import java.util.Scanner;

public class DDD {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int DDD;
        
        DDD = s.nextInt();
        
        if (DDD==61){
            System.out.printf("Brasilia\n");
        }
        else if (DDD==71){
            System.out.printf("Salvador\n");
        }
        else if (DDD==11){
            System.out.printf("Sao Paulo\n");
        }
        else if (DDD==21){
            System.out.printf("Rio de Janeiro\n");
        }
        else if (DDD==32){
            System.out.printf("Juiz de Fora\n");
        }
        else if (DDD==19){
            System.out.printf("Campinas\n");
        }
        else if (DDD==27){
            System.out.printf("Vitoria\n");
        }
        else if (DDD==31){
            System.out.printf("Belo Horizonte\n");
        }
        else {
            System.out.printf("DDD nao cadastrado\n");
        }
        
        
    }
}
