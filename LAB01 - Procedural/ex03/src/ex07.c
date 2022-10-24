#include <stdio.h>

int main(){
    int iAux, iWhile, posicaoMaior;
    double notas[5], notaMaior;

    printf("<< Normalizando as notas >>\n");

    notaMaior = notas[0];
    posicaoMaior = 0;
    iWhile = 0;

    while(iWhile <= 4){
        printf("Entre com a nota do aluno %d: ", iWhile + 1);
        scanf("%lf", &notas[iWhile]);
        if(notas[iWhile] < 0){
            if(iWhile == 0){
                printf("Erro: Valor invalido\n\n");
                iWhile = 0;
            } else{
                printf("Erro: Valor invalid\n\n");
                iWhile = iWhile;
            }
        } else{
            iWhile++;
        }
    }
    
    for(iAux = 0; iAux <= 4; iAux++){
        if(notas[iAux] > notaMaior) {
            notaMaior = notas[iAux];
            posicaoMaior = iAux;
        }
    }
    printf("\n");
    notas[posicaoMaior] = 100.00;
    printf("Notas normalizadas: \n");

    for(iAux = 0; iAux <= 4; iAux++){
        if(iAux <= 3){
            printf("A nota do aluno %d eh %.0lf\n", iAux + 1, notas[iAux] * 2);} 
        else{ printf("A nota do aluno %d eh %.0lf\n", iAux + 1, notas[iAux]); }
    }
    return 0;
}

/*
Elabore um algoritmo para normalizar as notas de uma turma de 5 alunos.
A maior nota deve virar 100 e as demais devem ser modificadas 
proporcionalmente (pense em regra de três).

Exemplo de Saída
<< Normalizando as notas >>
Entre com a nota do aluno 1: 16
Entre com a nota do aluno 2: 20
Entre com a nota do aluno 3: 30
Entre com a nota do aluno 4: 45
Entre com a nota do aluno 5: 50

Notas normalizadas

A nota do aluno 1 é 32
A nota do aluno 2 é 40
A nota do aluno 3 é 60
A nota do aluno 4 é 90
A nota do aluno 5 é 100
*/