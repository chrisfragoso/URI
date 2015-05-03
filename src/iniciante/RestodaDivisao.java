

package iniciante;

import java.util.Scanner;

public class RestodaDivisao {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int x,y,i;
        
        x = s.nextInt();
        y = s.nextInt();
        
        if (x<y){
            for(i=x+1;i<y;i++){
                if(((i%5)==2)||((i%5)==3)){
                System.out.printf("%d\n",i);
            }
            }
        }
        
        if (x>y){
            for(i=y+1;i<x;i++){
                if(((i%5)==2)||((i%5)==3)){
                System.out.printf("%d\n",i);
            }
            }
        }
  
        }
    
}
