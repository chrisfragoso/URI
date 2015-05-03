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

public class MaiorEposicao {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int num, i, maior=0, pos=0;
        
      
        
        for (i=0;i<4;i++){
             num = s.nextInt();
             
             if (num>maior){
                 maior = num;
                 pos = i;
             }
             
            
        } 
         System.out.printf("%d\n", maior);
         System.out.printf("%d\n", pos);
    }
    
}
