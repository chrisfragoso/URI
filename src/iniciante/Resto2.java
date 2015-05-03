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

public class Resto2 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int N, i;
        
        N = s.nextInt();
        
        while(N<1000){
            
            for (i=0;i<10000;i++){
                if ((i%N)==2){
                    System.out.printf(i + "\n");
                }
            }
            break;
        }
    }
    
}
