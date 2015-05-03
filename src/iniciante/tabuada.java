
package iniciante;



/**
 *
 * @author christianelaisa
 */
import java.util.Scanner;
public class tabuada {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int a,b,c;
         
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
         
        if ((a<b)&&(a<c)){
            if (b<c) {
                System.out.printf(a + "\n" + b + "\n" + c + "\n\n");}
            else if(b>c){
                System.out.printf(a + "\n" + c + "\n" + b + "\n\n");}
             
        }
         
        else if ((b<a)&&(b<c)){
            if (a<c) {
                System.out.printf(b + "\n" + a + "\n" + c + "\n\n");}
            else if(a>c){
                System.out.printf(b + "\n" + c + "\n" + a + "\n\n");}
             
        }
             
         
       else if ((c<a)&&(c<b)){
            if (a<b) {
                System.out.printf(c + "\n" + a + "\n" + b + "\n\n");}
            else if(a>b){
                System.out.printf(c + "\n" + b + "\n" + a + "\n\n");}
             
        } 
     
     System.out.printf(a + "\n" + b + "\n" + c + "\n");
     
    }
     
}
