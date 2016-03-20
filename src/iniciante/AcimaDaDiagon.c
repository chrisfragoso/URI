/*           UNIPETECH
        CHRISTIANE FRAGOSO
       CIENCIA DA COMPUTAÇÃO  */

#include <stdio.h>

int main(){
    char opt;
    int i, j;
    double N[12][12], soma = 0.0;
    
    
    scanf("%s", &opt);   
    
    for(i = 0; i < 12; i++){
            for(j = 0; j < 12; j++){
                   scanf("%lf", &N[i][j]);
                   
                   if(i > j){
                        soma += N[i][j];
                   }
            }
   }
   
   if(opt == 'S')
         printf("%.1f\n", soma);
    else
         printf("%.1f\n", soma/66.0);
    return 0;
}


