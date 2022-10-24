#include <stdio.h>

int main(){
    int verde, azul, amarela, vermelha;
    float p1, p2, p3, p4, total;
    int bolinhas[4];
    int maior = 0;

    printf("<< Probabilidades >>\n\nDigite a quantidade de bolinhas\n");

    printf("Verde: ");
    scanf("%d", &verde);
    printf("Azul: ");
    scanf("%d", &azul);
    printf("Amarela: ");
    scanf("%d", &amarela);
    printf("Vermelha: ");
    scanf("%d", &vermelha);

    bolinhas[0] = verde;
    bolinhas[1] = azul;
    bolinhas[2] = amarela;
    bolinhas[3] = vermelha;

    for(int i=0; i<4; i++){
        if(bolinhas[i]>maior)
            maior = bolinhas[i];
    }

    total = verde + azul + amarela + vermelha;
    p1 = verde/total;
    p2 = azul/total;
    p3 = amarela/total;
    p4 = vermelha/total;

    printf("\n");

    printf("Probabilidades\n");
    printf("Verde: %.2f%%", p1*100);
        if(bolinhas[0] == maior){
            printf(" << Maior probabilidade");
        }
    printf("\n");
    printf("Azul: %.2f%%", p2*100);
        if(bolinhas[1] == maior){
            printf(" << Maior probabilidade");
        }
    printf("\n");
    printf("Amarela: %.2f%%", p3*100);
        if(bolinhas[2] == maior){
            printf(" << Maior probabilidade");
        }
    printf("\n");
    printf("Vermelha: %.2f%%", p4*100);
        if(bolinhas[3] == maior){
            printf(" << Maior probabilidade");
        }
    return 0;
}

/*
Uma piscina de bolinhas possui bolas azuis, verdes, amarelas e vermelhas. 
Faça um programa em que o usuário digita a quantidade de bolinhas de cada
cor existente em uma piscina e mostra a probabilidade de ocorrência de cada 
cor, indicando qual possui a maior probabilidade

Exemplo de saída:
<< Probabilidades >>

Digite a quantidade de bolinhas
Verde: 51
Azul: 60
Amarela: 70
Vermelha: 80

Probabilidades
Verde: 19.5%
Azul: 22.9%
Amarela: 26.8%
Vermelha: 30.6% << Maior probabilidade
*/