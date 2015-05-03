package iniciante;

import java.util.Scanner;

public class numerosPositivos {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        double a,b,c,d,e,f; 
        int num = 0;
        
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        d = s.nextDouble();
        e = s.nextDouble();
        f = s.nextDouble();
        
        if (a>0){
            num++;
        }
        if (b>0){
            num++;
        }
        if (c>0){
            num++;
        }
        if (d>0){
            num++;
        }
        if (e>0){
            num++;
        }
        if (f>0){
            num++;
        }
        
        System.out.printf("%d valores positivos\n",num);
    }
}

         
        
