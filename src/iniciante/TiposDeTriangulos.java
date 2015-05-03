/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iniciante;

/**
 *
 * @author christianelaisa
 */
import java.util.Scanner;
public class TiposDeTriangulos {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        double A, B, C, aux;
        
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();
   
        while (A>0 && B>0 && C>0){
            
            if ((A<=B)&&(A<C)){
               if (B<C) {
                aux = A;
                A = C;
                C = aux;
                System.out.printf(A + " " + B + " " + C);}
                else if(B>C){
                    aux = A;
                    A = B;
                    B = aux;
                    
                    aux = B;
                    B = C;
                    C = aux;
                    System.out.printf(A + " " + B + " " + C);
                }}
            else if ((B<A)&&(B<C)){
            if (A<=C) {
                aux = B;
                B = C;
                C = aux;
                
                aux = A;
                A = B;
                B = aux;
                System.out.printf(A + " " + B + " " + C);}
            else if(A>C){
                aux = B;
                B = A;
                A = aux;
                System.out.printf(A + " " + B + " " + C);}
            
        }
            else if ((C<=A)&&(C<B)){
            if (A<B) {
                aux = A;
                A = B;
                B = aux;
            System.out.printf(A + " " + B + " " + C);}
                
           
            
        }
            
            
                if (A>=(B+C)){
                System.out.printf("NAO FORMA TRIANGULO\n");     
            }
            
            else { 
                
                if (A == (Math.sqrt((B*B) + (C*C)))){
                System.out.printf("TRIANGULO RETANGULO\n");
            }
            else if (A >  (Math.sqrt((B*B)+(C*C)))){
                System.out.printf("TRIANGULO OBTUSANGULO\n");
            }
            else if (A < Math.sqrt((B*B)+(C*C))){
                System.out.printf("TRIANGULO ACUTANGULO\n");
            }
                if (A==B && B==C && C==A){
                System.out.printf("TRIANGULO EQUILATERO\n");
            }
                else if (A==B || B==C || A==C){
                System.out.printf("TRIANGULO ISOSCELES\n");
            }}
          break;  
        }
    }
}
