
package iniciante;

import java.util.Scanner;

public class QuadCub {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int num,i,j=0;
        
        num = s.nextInt();
        
        for(i=1;i<=num;i++){
            System.out.printf("i: %d\n", i);
        }
        
        for(j=i;j<4;j=i*j){
           
            
        }
         System.out.printf("j: %d\n", j);
    
}
}
