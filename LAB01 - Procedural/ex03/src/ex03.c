#include <stdio.h>

int main(){
    char valores[6];
    int iScan, iPrint;

    printf("<< Listando um vetor em ordem inversa >>\n");

    for(iScan = 0; iScan <= 5; iScan++){
        printf("Entre com o numero %d: ", iScan+1);
        scanf(" %c", &valores[iScan]);}

    printf("Ordem inversa dos numeros:");

    for(iPrint = 5; iPrint >= 0; iPrint--){
        printf(" %c", valores[iPrint]);}

    printf("\n");
    return 0;
}
/*
Faça um programa em que o usuário digita 6 números inteiros e o programa mostra
na tela os 6 números digitados na ordem inversa (obrigatório o uso de loops)

Exemplo de saída:
<< Listando um vetor em ordem inversa >>
Entre com o numero 1: 5
Entre com o numero 2: 6
Entre com o numero 3: 4
Entre com o numero 4: 0
Entre com o numero 5: 3
Entre com o numero 6: 6

Ordem inversa dos numeros: 6 3 0 4 6 5
*/
