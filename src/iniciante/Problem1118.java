
package iniciante;

import java.util.Scanner;

public class Problem1118 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double nota1 = 0, nota2 = 0, media;
        int cod;
        
        do{
            
        do{
            nota1 = s.nextDouble();
            
            if (nota1<0 || nota1>10){
                System.out.printf("nota invalida\n");
            }
        }while(nota1<0 || nota1>10);
            
        
            
        do{
            nota2 = s.nextDouble();
            
            if (nota2<0 || nota2>10){
                System.out.printf("nota invalida\n");
            }
        }while(nota2<0 || nota2>10);
            
               
                 media = (double)(nota1+nota2)/2;
                 System.out.printf("media = %.2f\n", media);
                
                 do{
                        System.out.printf("novo calculo (1-sim 2-nao)\n");
                        cod = s.nextInt();
                        
                        switch(cod){
                            
                            case 1: continue;
                                
                            case 2: System.exit(0);
                        }         
                        }while(cod<1 || cod>2);
        }while(cod==1);
        }
}

