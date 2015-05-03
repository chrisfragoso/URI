/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iniciante;

import java.util.Scanner;

public class NumESomas {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int m=0,n=0,i,sum;
        
        do{
            
            m = s.nextInt();
            n = s.nextInt();
            
            sum = 0;
          
            if(m>0 && n>0){
              if(m<=n){  
                for(i=m;i<=n;i++){
                    System.out.printf("%d ",i);
                    sum=sum+i;
                    }
                System.out.printf("Sum=%d\n", sum);
             }
              
              else if(m>n){  
                for(i=n;i<=m;i++){
                    System.out.printf("%d ",i);
                    sum=sum+i;
                    }
                System.out.printf("Sum=%d\n", sum);
              }
            }   
        }while(m>0 && n>0);
        
    }
}
