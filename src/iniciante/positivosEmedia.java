
package iniciante;

import java.util.Scanner;

public class positivosEmedia {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        double a,b,c,d,e,f,nota=0, media; 
        int num = 0;
        
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        d = s.nextDouble();
        e = s.nextDouble();
        f = s.nextDouble();
        
        
        if (a>0){
            num++;
            nota = a + nota;
            
        }
        if (b>0){
            num++;
            nota = b + nota;
        }
        if (c>0){
            num++;
            nota = c + nota;
        }
        if (d>0){
            num++;
            nota = d + nota;
        }
        if (e>0){
            num++;
            nota = e + nota;
        }
        if (f>0){
            num++;
            nota = f + nota;
        }
        
        System.out.printf("%d valores positivos\n",num);
        System.out.printf(nota/num + "\n");
        
    }
    
}
