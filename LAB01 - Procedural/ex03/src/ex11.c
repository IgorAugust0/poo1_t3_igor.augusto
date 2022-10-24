#include <stdio.h>

int main() {
    int valores[5], i, totalImpar, parTotal, control, auxImpar, auxPar;

    totalImpar = 0;
    parTotal = 0;

    printf("<< Pares e Impares >>\n");
    for(i = 0; i <= 4; i++){
        printf("Digite o valor %d: ", i + 1);
        scanf("%d", &valores[i]);
        if(valores[i] % 2 != 0){
            totalImpar += 1;
        } else {
            parTotal += 1;
        }
    }

    int valoresImpares[totalImpar], valoresPares[parTotal];

    auxImpar = 0;
    auxPar = 0;

    for(i = 0; i <= 4; i++){
        if(valores[i] % 2 != 0){
            valoresImpares[auxImpar] = valores[i];
            auxImpar += 1;
        } else {
            valoresPares[auxPar] = valores[i];
            auxPar += 1;
        }
    }
    printf("\nImpares:");

    control = totalImpar - 1;

    for(i = 0; i <= control; i++){
        printf(" %d", valoresImpares[i]);
    }
    printf("\n");
    printf("Pares:");

    control = parTotal - 1;

    for(i = 0; i <= control; i++){
        printf(" %d", valoresPares[i]);
    }
    printf("\n");

    return 0;
}

/*
Leia 5 números inteiros e armazene em um vetor v. Crie dois novos vetores v1 e v2. Copie os valores ímpares de v para v1, e os valores pares de v para v2. Note que cada um dos vetores v1 e v2 tem no máximo 5 elementos, mas nem todos os elementos são utilizados. No final escreva os elementos UTILIZADOS de v1 e v2.  
Exemplo de saída:
<< Pares e Ímpares >>
Digite o valor 1: 51
Digite o valor 2: 60
Digite o valor 3: 70
Digite o valor 4: 80
Digite o valor 5: 60

Ímpares: 51
Pares: 60, 70, 80, 60
*/