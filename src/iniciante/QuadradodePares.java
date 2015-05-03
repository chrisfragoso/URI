/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iniciante;

import java.util.Scanner;

/**
 *
 * @author christianelaisa
 */

public class QuadradodePares {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
     
        int N,i, pares;
        
        N = s.nextInt();
        
        while (N>5 && N<2000){
            for (i=1;i<=N;i++){
                if ((i%2)==0){
                    
                    pares = i*i;
                
                System.out.printf(i + "^2 = " + pares + "\n");
            }
            }
            break;
        }
    }
    
}
