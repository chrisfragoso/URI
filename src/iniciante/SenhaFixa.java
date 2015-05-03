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
public class SenhaFixa {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int senha;
        boolean continuar=true;
        
        
        
        do {
            senha = s.nextInt();
            
            if(senha==2002){
            continuar=false;
                System.out.printf("Acesso Permitido\n");}
            
            else{
                System.out.printf("Senha Invalida\n");
                }
                
            
        }while(continuar);
        
        
        }
        
    
        }
