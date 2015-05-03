package iniciante;

import java .util.Scanner;

public class horario{
    public static void main(String[] args)  {
       // Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
       
        int SEG, RESTANTE;
        int horas, minutos, segundos;
        
        SEG= s.nextInt();
        
        RESTANTE = SEG;
        
        horas = RESTANTE/3600;
        RESTANTE = RESTANTE - (horas*3600);
        
        minutos = RESTANTE/60;
        RESTANTE = RESTANTE - (minutos*60);
        
        segundos = RESTANTE;
       
 
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
        
        

    }
}