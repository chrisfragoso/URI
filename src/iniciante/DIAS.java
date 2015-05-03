package iniciante;
import java.util.Scanner;
    
public class DIAS{
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        
        int age, RESTANTE;
        int years, months, days;
         
        age= s.nextInt();
         
        RESTANTE = age;
         
        years = RESTANTE/365;
        RESTANTE = RESTANTE - (years*365);
         
        months = RESTANTE/30;
        RESTANTE = RESTANTE - (months*30);
         
        days = RESTANTE;
        
  
        System.out.printf("%d:%d:%d\n", years, months, days);
         
         
 
    }
}