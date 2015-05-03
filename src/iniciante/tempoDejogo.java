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
public class tempoDejogo {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int hi, hf, totalh=0, mi, mf, totalm=0;
           
        hi = s.nextInt();
        mi = s.nextInt();
        hf = s.nextInt();
        mf = s.nextInt();
           
        if (hf<hi) {
            totalh = hf - hi + 24;
            System.out.printf("O JOGO DUROU %d HORA(S) E ", totalh);
            
        }
         
        if (hi==hf){
            totalh = 24;
            System.out.printf("O JOGO DUROU %d HORA(S) E ", totalh);
             
        }
       
          
        if (hf>hi ){
              
            totalh = hf  - hi;
            System.out.printf("O JOGO DUROU %d HORA(S) E ", totalh);
        }
        
        if (mf<mi){
            totalm = mf - mi + 60;
            System.out.printf("%d MINUTO(S)\n", totalm);
        }
        
        if (mf>mi){
            totalm = hf - hi;
            System.out.printf("%d MINUTO(S)\n", totalm);
        }
        
        else if (mi==mi){
            totalm = 0;
            System.out.printf("%d MINUTO(S)\n", totalm);
            
        }
        
        
        
        }
    }
    

