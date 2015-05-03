package iniciante;

import java.util.Scanner;

public class impares {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int i,x;
        
        x = s.nextInt();
    
    while (x>=1 && x<=1000){
       for (i=1; i<=x; i++){
            if((i%2)!=0){
                
                System.out.printf(i + "\n");
                
               }
            
     }
      break; 
    }
    }
}