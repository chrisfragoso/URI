
package iniciante;

/**
 *
 * @author christianelaisa
 */
import java.util.Scanner;
public class SixNumerosImpares {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int X, i;
        
        X = s.nextInt();
        
        for (i=X;i<X+12;i++){
            if ((i%2)!=0){
                
                System.out.printf("" + i + "\n");
               
            }
        }
    }
}
