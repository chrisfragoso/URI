
package iniciante;

/**
 *
 * @author christianelaisa
 */

import java.util.Scanner;

public class bhaskara {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double A, B, C, DELTA, R1, R2;
        
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();
        
        DELTA = (B * B) - (4 * A * C);
        
        R1 = (- B + Math.sqrt(DELTA))/(2*A);
        R2 = (- B - Math.sqrt(DELTA))/(2*A);
        
        if ((DELTA >= 0) && (A!=0)) {
            
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
           
        }
        
        else {
        System.out.printf("Impossivel calcular\n");
        }
        
    }
    
}
