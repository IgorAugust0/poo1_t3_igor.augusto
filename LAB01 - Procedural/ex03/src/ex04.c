#include <stdio.h>

int main(){
    int valores[6], iScan = 0, iAux;

    printf("<< Listando um vetor de numeros pares >>\n");

    while(iScan <=5){
        printf("Entre com o numero %d: ", iScan + 1);
        scanf("%d", &valores[iScan]);

        if(valores[iScan] < 0 || valores[iScan] % 2 != 0){
            if(iScan == 0){
                printf("Erro: Valor invalido\n\n");
                iScan = 0;} 
            else{
                printf("Erro: Valor invalido\n\n");
                iScan = iScan;}} 
            else{
            iScan++;}
    }
    
        printf("Os numeros pares digitados foram:");

        for(iAux = 0; iAux <= 5; iAux++){
        printf(" %d", valores[iAux]);}

        printf("\n");

        return 0;
}

/*
Crie um programa que lê 6 valores inteiros e em seguida mostra na tela os 
valores lidos. Utilize loops e utilize vetores para armazenar os números.
O programa deve somente aceitar números pares. 
Dica: é melhor usar loop *while* para ler os números

Exemplo de saída:
<< Listando um vetor de numeros pares>>
Entre com o numero 1: 5
Erro: Valor invalido

Entre com o numero 1: 6
Entre com o numero 2: 4
Entre com o numero 3: 0
Entre com o numero 4: 3
Erro: Valor invalido

Entre com o numero 4: 6
Entre com o numero 5: -1
Erro: Valor invalido

Entre com o numero 5: 2
Entre com o numero 6: 50

Os numeros pares digitados foram: 6 4 0 6 2 50
*/
