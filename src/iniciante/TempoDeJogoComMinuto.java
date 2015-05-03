

package iniciante;

import java.util.Scanner;


public class TempoDeJogoComMinuto {
  public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
         
        int hi, hf, mi, mf, totalh = 0, totalm = 0, totalho = 0;
            
        hi = s.nextInt();
        mi = s.nextInt();
        hf = s.nextInt();
        mf = s.nextInt();
            
        
       while (hi<=hf){
        if (hi==hf){
            if (mi<mf){
               totalh=24;
                totalm = mf - mi;
           System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", totalh, totalm);
           }
            
            else if (mi>mf){
                totalh=24;
                totalm = 60 - (mi - mf);
                totalho= totalh - (mi - mf) ;
            
           System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", totalho, totalm);
            }
            
            else if (mi==mf){
                 totalh=24;
                 totalm = mi-mf;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", totalh, totalm);
                 
         }}
        
        else if (hi!=hf)
           if (mi<mf){
                totalh = hf - hi;
                totalm = mf - mi;
           System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", totalh, totalm);
           }
            
            else if (mi>mf){
                totalh = (hf - hi);
                totalm = 60 - (mi - mf);
                totalho= totalh - (mi - mf) ;
            
           System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", totalho, totalm);
            }
            
            else if (mi==mf){
                 totalh = hf - hi;
                 totalm = mi-mf;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", totalh, totalm);
                 
                
            }
           
          break;
       }
  
  }

}