
package iniciante;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author christianelaisa
 */
public class aumentoDeSalario {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        
        
        double X, NovoSalario = 0, Reaj = 0;
        int perc = 0;
        
        X = s.nextDouble();
        
        if (X>0 && X<=400){
            perc = 15;
            Reaj = X*0.15;
            NovoSalario = X + Reaj;

        }
        
        else if (X>400 && X<=800){
            perc = 12;
            Reaj = X*0.12;
            NovoSalario = X + Reaj;
        
        }
        
        else if (X>800 && X<=1200){
            perc = 10;
            Reaj = X*0.10;
            NovoSalario = X + Reaj;
        
        }
        
        else if (X>1200 && X<=2000){
            perc = 7;
            Reaj = X*0.07;
            NovoSalario = X + Reaj;
        
        }
        
        else if (X>2000){
            perc = 4;
            Reaj = X*0.04;
            NovoSalario = X + Reaj;
        
        }
        
        System.out.printf("Novo salario: %.2f\n", NovoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", Reaj);
        System.out.printf("Em percentual: %d %%\n", perc);
        
    }
}
