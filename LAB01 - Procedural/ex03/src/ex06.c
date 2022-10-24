#include <stdio.h>

int main(){
    double valores[5], total, media, maior, menor;
    int iScan = 0, iAux, iMaior, iMenor, posicaoMaior, posicaoMenor;

    printf("<< Five Values with index >>\n");

    while(iScan <= 4){
        printf("Input #%d: ", iScan + 1);
        scanf("%lf", &valores[iScan]);
        if(valores[iScan] < 0){
            if(iScan == 0){
                printf("Erro!\n\n");
                iScan = 0;
            } else{
                printf("Erro!\n\n");
                iScan = iScan;
            }
        } else{
            total += valores[iScan];
            iScan++;
        }
    }

    media = total / 5;
    maior = valores[0];
    menor = valores[0];
    posicaoMaior = 0;
    posicaoMenor = 0;

    for(iMaior = 0; iMaior <= 4; iMaior++){
        if(valores[iMaior] > maior) {
            maior = valores[iMaior];
            posicaoMaior = iMaior;
        } 
    }

    for(iMenor = 0; iMenor <=  4; iMenor++){
        if(valores[iMenor] < menor){
            menor = valores[iMenor];
            posicaoMenor = iMenor;
        }
    }

    printf("The numbers entered are:");

    for(iAux = 0; iAux <= 4; iAux++){
        printf(" %.0lf", valores[iAux]);}
    printf("\n");
    printf("Max. Value: %.0lf, index %d of the array\n", maior, posicaoMaior);
    printf("Min. Value: %.0lf, index %d of the array\n", menor, posicaoMenor);
    printf("Mean: %.1lf\n", media);

    return 0;
}

/*
Fazer um programa para ler 5 valores, e, em seguida, mostrar todos os valores
lidos juntamente com o maior (Max), o menor (Min) e a média (Mean) dos valores
Mostrar o índice (index) do vetor associado ao maior número e ao menor número 

Exemplo de saída:
<< Five Values with index >>
Input #1: 5
Input #2: 6
Input #3: 4
Input #4: 0
Input #5: 3

The numbers entered are: 5 6 4 0 3
Max. Value: 6, index 1 of the array
Min. Value: 0, index 3 of the array
Mean: 3.6
*/