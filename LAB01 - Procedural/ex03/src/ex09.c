#include <stdio.h>

int main(){
    int nDeEstudantes, iScanf, iPrintf, controleDeIndice;
    double notas[100], totalNotas, media;

    printf("<< Media de n alunos. Maximo 100 alunos >>\n");
    printf("Entre com o numero de alunos: ");
    scanf("%d", &nDeEstudantes);

    if(nDeEstudantes > 100){
        printf("Erro! O numero maximo de alunos permitido eh 100.\n");
    } else{
        controleDeIndice = nDeEstudantes - 1;
        totalNotas = 0.00;

        for(iScanf = 0; iScanf <= controleDeIndice; iScanf++){
            printf("Digite a nota do aluno %d: ", iScanf+1);
            scanf("%lf", &notas[iScanf]);
            totalNotas += notas[iScanf];
        }

        media = totalNotas / nDeEstudantes;

        printf("\nRelatorio de Notas\n");
        for(iPrintf = 0; iPrintf <= controleDeIndice; iPrintf++){
            printf("A nota do aluno %d eh: %.0lf\n", iPrintf + 1, notas[iPrintf]);
        }
        printf("A media da turma eh: %.1lf\n", media);
    }
    return 0;
}

/*
Faça um programa que calcula a média das notas dos alunos de uma turma. Note 
que uma turma pode ter no máximo 100 alunos (mostrar uma mensagem de erro 
caso o número escolhido seja maior que 100). Peça para o usuário entrar com 
o número de alunos e ao final mostre a nota de todos os alunos.

Exemplo de Saída
<< Media de n alunos. Maximo 100 alunos >>
Entre com o numero de alunos: 4
Digite a nota do aluno 1: 6
Digite a nota do aluno 2: 7
Digite a nota do aluno 3: 5
Digite a nota do aluno 4: 4

Relatorio de Notas
Nota do aluno 0: 6
Nota do aluno 1: 7
Nota do aluno 2: 5
Nota do aluno 3: 4
Media da turma:  5.5

------------------------------------
Exemplo de Saída 2
<< Media de n alunos. Maximo 100 alunos >>
Entre com o numero de alunos: 400
Erro! O numero maximo de alunos permitido eh 100.
*/
