#include <stdio.h>

int main(){
    char valores[6];
    int iScan, iPrint;

    printf("<< Listando um vetor - com loops >>\n");

    for(iScan = 0; iScan <= 5; iScan++){
        printf("Entre com o numero %d: ", iScan+1);
        scanf(" %c", &valores[iScan]);}

    printf("Os valores lidos:");

    for(iPrint = 0; iPrint <= 5; iPrint++){
        printf(" %c", valores[iPrint]);}

    printf("\n");
    return 0;
}

/*
Crie um programa que lê 6 valores inteiros e em seguida mostra na tela os 
valores lidos. Utilize loops e utilize vetores para armazenar os números.
(pense qual o melhor loop: for, while ou do-while)

*/