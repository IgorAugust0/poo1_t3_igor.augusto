#include <stdio.h>

int main()  {
    int valorA[3], valorB[3], valorC[3], i;

    printf("<< Subtracao de vetores >>\n");

    for(i = 0; i < 3; i++){
        printf("Digite o valor %d de A: ", i + 1);
        scanf("%d", &valorA[i]);
    }
    printf("\n");

    for(i = 0; i < 3; i++){
        printf("Digite o valor %d de B: ", i + 1);
        scanf("%d", &valorB[i]);
    }
    printf("\n");

    printf("O vetor C, definido como C = A-B:  (");
    
    for(i = 0; i < 3; i++){
        valorC[i]= valorA[i] - valorB[i];
        if(i == 2){
            printf("%d", valorC[i]);
        } else{
            printf("%d, ", valorC[i]);
        }
    }
    printf(")\n");

    return 0;
}

/*
Faça um programa que receba do usuário dois arrays  A e B, com 3 números inteiros cada. Crie um novo array C calculando C = A - B. Mostre na tela os dados do array C.

Exemplo de saída:
<< Subtracao de vetores >>
Digite o valor 1 de A: 50
Digite o valor 2 de A: 60
Digite o valor 3 de A: 70

Digite o valor 1 de B: 30
Digite o valor 2 de B: 0
Digite o valor 3 de B: -10

O vetor C, definido como C = A-B:  (20, 60, 80) 
*/