/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iniciante;

import java.util.Scanner;

public class coordenadasDeUmPonto {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double A, B;
        
        A = s.nextDouble();
        B = s.nextDouble();
        
        if ((A>0) && (B>0)){
            System.out.print("Q1\n");}
        
        else if ((A<0) && (B>0)){
            System.out.print("Q2\n");}
        
        else if ((A<0) && (B<0)){
            System.out.print("Q3\n");}
        
        else if ((A>0) && (B<0)){
            System.out.print("Q4\n");}
        
        else if ((A==0) && (B==0)){
            System.out.print("Origem\n");}
        
        else if ((A==0) && (B!=0)){
            System.out.print("Eixo Y\n");}
        
        else if ((A!=0) && (B==0)){
            System.out.print("Eixo X\n");}
        
        
        }
    
}
