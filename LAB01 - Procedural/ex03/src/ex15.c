#include <stdio.h>

int main(){
    int n[8];     
        
    printf("<< Valores iguais >>\n");
    for(int i=0; i <= 7; i++){
        printf("Entre com o numero %i: ", i+1);
        scanf("%i",&n[i]);
    }    
        
    printf("\n\nValores repetidos: ");    
    for(int j = 0; j <= 7 ; j++) {    
        for(int k = j + 1; k < 8; k++) {    
            if(n[j] == n[k])    
                printf("%d, ", n[k]);    
        }    
    }   
    return 0;
}

/*
Faça um programa que leia um vetor de 8 posições e verifique se existem 
valores iguais e os escreva (cada número repetido deve aparecer somente 
uma vez na resposta)

Exemplo de saída:
<< Valores iguais >>
Entre com o numero 1: 5
Entre com o numero 2: 6
Entre com o numero 3: 4
Entre com o numero 4: 5
Entre com o numero 5: -3 
Entre com o numero 6: -3
Entre com o numero 7: -3
Entre com o numero 8: 6


Valores repetidos: 5, 6, -3
*/