package iniciante;
/**
 *
 * @author christianelaisa
 */
import java.util.Scanner;

public class testeDeSelecao1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int A, B, C, D, X, Y;
        
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        D = s.nextInt();
        
        X = C + D;
        Y = A + B;
        
        if ((C>=0) && (D>=0) && ((A%2)==0)) {
           
            if (((D > C) && (D > A)) && (X > Y)){
                
                System.out.printf("Valores aceitos\n");
                
            } 
            
            else  {
                System.out.printf("Valores nao aceitos\n");
            }
            
        }
        else{
        System.out.printf("Valores nao aceitos\n");
        }
    }
    
}
