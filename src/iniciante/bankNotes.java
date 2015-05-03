package iniciante;

//import java.io.PrintStream;
import java .util.Scanner;

public class bankNotes{
    public static void main(String[] args)  {
       // Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
       
       
        double N, troco;
        int cem, cinq, vinte, dez, cinco, dois, um;
        int cinqc, vintec, dezc, cincoc, umc ;
          
        N = s.nextDouble();
          
        troco = N;
          
        cem = (int) (troco/100);
        troco = troco%100;
           
        cinq = (int) (troco/50);
        troco = troco%50;
           
        vinte = (int) (troco/20);
        troco = troco%20;
           
        dez = (int) (troco/10);
        troco = troco%10;
           
        cinco = (int) (troco/5);
        troco = troco%5;
           
        dois = (int) (troco/2);
        troco = troco%2;
           
        um = (int) (troco/1);
        troco = troco%1;
          
        cinqc = (int) (troco/0.5);
        troco = troco%0.5;
          
        vintec = (int) (troco/0.25);
        troco = troco%0.25;
          
        dezc = (int) (troco/0.10);
        troco = troco%0.10;
          
        cincoc = (int) (troco/0.05);
        troco = troco%0.05;
          
        umc = (int)(troco/0.01);
          
          
          
           
        System.out.printf("NOTAS:\n");
        System.out.printf("%d nota(s) de R$ 100.00\n", cem);
        System.out.printf("%d nota(s) de R$ 50.00\n", cinq);
        System.out.printf("%d nota(s) de R$ 20.00\n", vinte);
        System.out.printf("%d nota(s) de R$ 10.00\n", dez);
        System.out.printf("%d nota(s) de R$ 5.00\n", cinco);
        System.out.printf("%d nota(s) de R$ 2.00\n", dois);
        System.out.printf("MOEDAS:\n");
        System.out.printf("%d moeda(s) de R$ 1.00\n", um);
        System.out.printf("%d moeda(s) de R$ 0.50\n", cinqc);
        System.out.printf("%d moeda(s) de R$ 0.25\n", vintec);
        System.out.printf("%d moeda(s) de R$ 0.10\n", dezc);
        System.out.printf("%d moeda(s) de R$ 0.05\n", cincoc);
        System.out.printf("%d moeda(s) de R$ 0.01\n", umc);
          
          
    }
}