
package iniciante;

import java.util.Scanner;

public class sortSimples {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int a,b,c, aux=0;
        
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        
        if ((a<b)&&(a<c)){
            if (b<c) {
                
                System.out.printf(a + "\n" + b + "\n" + c + "\n");}
            else if(b>c){
                System.out.printf(a + "\n" + c + "\n" + b + "\n");}
            
        }
        
        else if ((b<a)&&(b<c)){
            if (a<c) {
                System.out.printf(b + "\n" + a + "\n" + c + "\n");}
            else if(a>c){
                System.out.printf(b + "\n" + c + "\n" + a + "\n");}
            
        }
            
        
       else if ((c<a)&&(c<b)){
            if (a<b) {
                System.out.printf(c + "\n" + a + "\n" + b + "\n");}
            else if(a>b){
                System.out.printf(c + "\n" + b + "\n" + a + "\n");}
            
        } 
    
    
    
    }
    
}
