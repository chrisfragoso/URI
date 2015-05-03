/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iniciante;

/**
 *
 * @author christianelaisa
 */
import java.util.Scanner;
public class Animal {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        String subfilo, classe, cadeia;
        
        subfilo = s.nextLine();
        classe = s.nextLine();
        cadeia = s.nextLine();
        
        switch (subfilo) {
    case "vertebrado":
                 switch (classe) {
        case "ave":
                switch (cadeia) {
            case "carnivoro":
                System.out.printf("aguia\n");
                break;
            case "onivoro":
                System.out.printf("pomba\n");
                break;
        }
                break;
        case "mamifero":
                switch (cadeia) {
            case "onivoro":
                System.out.printf("homem\n");
                break;
            case "herbivoro":
                System.out.printf("vaca\n");
                break;
        }
                break;
        }  break;
                
                
        
    case "invertebrado":
                 switch (classe) {
        case "inseto":
                switch (cadeia) {
            case "hematofago":
                System.out.printf("pulga\n");
                break;
            case "herbivoro":
                System.out.printf("lagarta\n");
                break;
        }
                break;
        case "anelideo":
                switch (cadeia) {
            case "hematofago":
                System.out.printf("sanguessuga\n");
                break;
            case "onivoro":
                System.out.printf("minhoca\n");
                break;
        }
                break;
        }  break;
        }
    }
}

