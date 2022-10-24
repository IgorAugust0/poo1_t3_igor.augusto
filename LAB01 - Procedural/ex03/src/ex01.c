#include <stdio.h>

int main(){
    char valores[6];

    printf("<< Listando um vetor >>\n");
    printf("Entre com o numero 1: ");
    scanf(" %c", &valores[0]);
    printf("Entre com o numero 2: ");
    scanf(" %c", &valores[1]);
    printf("Entre com o numero 3: ");
    scanf(" %c", &valores[2]);
    printf("Entre com o numero 4: ");
    scanf(" %c", &valores[3]);
    printf("Entre com o numero 5: ");
    scanf(" %c", &valores[4]);
    printf("Entre com o numero 6: ");
    scanf(" %c", &valores[5]);

    printf("Os valores lidos sao: %c %c %c %c %c %c\n", valores[0], valores[1], valores[2], valores[3], valores[4], valores[5]);

    return 0;
}

/*
Crie um programa que lê 6 valores inteiros e em seguida mostra na tela os 
valores lidos. Utilize loops e utilize vetores para armazenar os números.
(pense qual o melhor loop: for, while ou do-while)

Exemplo de saída:
<< Listando um vetor >>
Entre com o numero 1: 5
Entre com o numero 2: 6
Entre com o numero 3: 4
Entre com o numero 4: 0
Entre com o numero 5: 3
Entre com o numero 6: 6

Valores lidos: 5 6 4 0 3 6
*/