

package iniciante;

import java.util.Scanner;

public class SomadeImpares {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int X, Y, soma = 0, i, aux = 0;
        
        X = s.nextInt();
        Y = s.nextInt();
        
       if (X>Y){
         aux = X;
         X = Y;
         Y = aux;}
        
            for (i=X+1; i<Y; i++){
                if ((i%2)!=0){
                   
                   soma = soma + i;}
             
        }
            System.out.printf(soma + "\n");

     }
    
}
