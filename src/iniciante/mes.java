/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iniciante;
import java.util.Scanner;
public class mes {
   
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int mes = s.nextInt();
       
     while (mes>0 && mes<=12){
        if (mes==1){
            System.out.printf("January\n");
            break;
        }
        else if (mes==2){
            System.out.printf("February\n");
            break;
        }
        else if (mes==3){
            System.out.printf("March\n");
            break;
        }
        else if (mes==4){
            System.out.printf("April\n");
            break;
        }
        else if (mes==5){
            System.out.printf("May\n");
            break;
        }
        else if (mes==6){
            System.out.printf("June\n");
            break;
        }
        else if (mes==7){
            System.out.printf("July\n");
            break;
        }
        else if (mes==8){
            System.out.printf("August\n");
            break;
        }
        else if (mes==9){
            System.out.printf("September\n");
            break;
        }
        else if (mes==10){
            System.out.printf("October\n");
            break;
        }
        else if (mes==11){
            System.out.printf("November\n");
            break;
        }
        else if (mes==12){
            System.out.printf("December\n");
            break;
        }
        
    } 
    
    }
}
