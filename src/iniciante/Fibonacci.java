/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iniciante;

/**
 *
 * @author christianelaisa
 * 
 */

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args)  {
       
             
        Scanner s = new Scanner(System.in);
               
        int n,a=0,b=1, next, i;
               
        n = s.nextInt();
      
      while (n>0 && n<46)  {     
        for (i=0; i<n; i++){
            if(i<=1){
                next = i;
            }
            else {
                next = a+b;
                a = b;
                b = next;
            }
            System.out.printf(" " + next);
        }
        System.out.printf("\b\n");
        break;
    }
  
}
    
}