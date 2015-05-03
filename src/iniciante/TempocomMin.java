/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iniciante;

import java.util.Scanner;

public class TempocomMin{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        float n1, n2, n3, n4, media = 0, notaexame = 0, mediaexame = 0;
        
        n1 = s.nextFloat();
        n2 = s.nextFloat();
        n3 = s.nextFloat();
        n4 = s.nextFloat();
       
        
       
        
        media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
        
        System.out.printf("Media: %.1f\n", media);
        
        
        
        
        if (media>=7){
            System.out.printf("Aluno aprovado.\n");
        }
        
        else if (media<5){
            System.out.printf("Aluno reprovado.\n");
            
        }
        
        
        
        while((media>=5)&&(media<7)){
            
            System.out.printf("Aluno em exame.\n");
            notaexame = s.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", notaexame);
            mediaexame = (media+notaexame)/2;
        
        
        if (mediaexame>=5){
            System.out.printf("Aluno aprovado.\n");
            System.out.printf("Media final: %.1f\n", mediaexame);
            break;
        }
        
        else if ((mediaexame>=0) && (mediaexame<5)){
            System.out.printf("Aluno reprovado.\n");
            System.out.printf("Media final: %.1f\n", mediaexame);
            break;
  
        
    }}
    }
    
}
