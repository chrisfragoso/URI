/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//PROBLEM 1074;
package iniciante;

/**
 *
 * @author christianelaisa
 * 
 */
import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int N, num, i;
        N = s.nextInt();
      
     while(N<10000){
        for (i=0;i<N;i++){
            
            num = s.nextInt();
            
            if ((num%2)==0){
                if (num>0){
                    System.out.printf("EVEN POSITIVE\n");}
                
                else if (num<0){
                    System.out.printf("EVEN NEGATIVE\n");}
                
                else if (num==0){
                     System.out.printf("NULL\n");
                }
                 }
            if ((num%2)!=0){
                if (num>0){
                    System.out.printf("ODD POSITIVE\n");}
                
                else if (num<0){
                    System.out.printf("ODD NEGATIVE\n");}
            }
            
        }
        break;
    }
    
  }
}
