package iniciante;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        double a,b,c,per,area;
        
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        
        if ((a>=b+c) || (b>=a+c) || (c>=a+b)){
            area = ((a+b)*c)/2;
            System.out.printf("Area = %.1f\n", area);
           
        }
        else {
            per = a+b+c;
            System.out.printf("Perimetro = %.1f\n", per);
            
            
    }
        
    }
    
}
