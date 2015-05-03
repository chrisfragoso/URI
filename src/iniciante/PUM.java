
package iniciante;

import java.util.Scanner;


/**
 *
 * @author christianelaisa
 */
public class PUM {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int i=0, N, a=1;
        
        
        N = s.nextInt();
        
        while (i<N){
        
            System.out.printf("%d %d %d PUM\n", a, a+1, a+2);
            a+= 4;
            i++;
            }
            
        }
     
}
        