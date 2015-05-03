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
public class Intervalo2 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int N, X = 0, i, in = 0, out = 0;
        
        N = s.nextInt();
        
        
            for (i=0;i<N;i++){
                
                X = s.nextInt();
                
                if (X>=10 && X<=20){
                    in++;
                }
                else {
                    out++;
                }
            }
            System.out.printf("%d in\n", in);
            System.out.printf("%d out\n", out);
           
        }
        
    }

