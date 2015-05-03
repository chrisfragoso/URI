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
public class valoresPares {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int num, i,n_par=0, n_imp=0, n_pos=0, n_neg=0;
        
        for (i=0;i<5;i++){
            num = s.nextInt();
            
            if ((num%2)==0){
                n_par++;
            }
            else{
                n_imp++;
            }
            if (num>0){
                n_pos++;
            }
            else if (num<0){
                n_neg++;
                
            }
            
               
        }
            System.out.printf("%d valor(es) par(es)\n", n_par);
            System.out.printf("%d valor(es) impar(es)\n", n_imp);
            System.out.printf("%d valor(es) positivo(s)\n", n_pos);
            System.out.printf("%d valor(es) negativo(s)\n", n_neg);
  
            
        }
    }
   
