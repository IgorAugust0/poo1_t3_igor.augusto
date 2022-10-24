#include <stdio.h>
#include <math.h>

int main(){
    double notas[5], media, total = 0.00, powTotal, valorSqrt, desvioPadrao;
    int iWhile = 0, iAux;

    printf("<< Media e desvio-padrao >>\n");

    while(iWhile <= 4){
        printf("Digite o valor %d: ", iWhile + 1);
        scanf("%lf", &notas[iWhile]);
        
        total += notas[iWhile];
        iWhile++;
    }

    media = total / 5;
    powTotal = 0.00;

    for(iAux = 0; iAux <= 4; iAux++) {
        powTotal += pow((notas[iAux] - media), 2);
    }

    valorSqrt = powTotal / 5;
    desvioPadrao = sqrt(valorSqrt);

    printf("A media eh %.0lf e o desvio-padrao eh: %.2lf\n", media, desvioPadrao);

    return 0;
}

/*
Calcular a média e o desvio padrão amostral de 5 números informados pelo usuário.
obs: desvio-padrão (amostral, normalizado por N-1)

Exemplo de saída:
<< Media e desvio-padrao >>
Digite o valor 1: 50
Digite o valor 2: 60
Digite o valor 3: 70
Digite o valor 4: 80
Digite o valor 5: 60
A media eh 64 e o desvio-padrao eh 11.40
*/
