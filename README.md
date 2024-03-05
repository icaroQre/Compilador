# CloackCompiller

## Introducao

O CloackCompiller foi desenvolvido como trabalho final da disciplina de compiladores da Universidade Estadual do Norte do Paraná. O compilador em questão gera códigos em C a partir da linguagem aceita.

## Estrutura

* ANTLR - Ferramenta que auxília na criação de analisadores léxicos e sintáticos com base em uma determinada gramática
* Gramática - Dita os elementos que compoe a linguagem aceita pelo compilador
* Lexer - Responsável pela análise léxica da entrada e geração de tokens
* Parser - Utiliza os tokens criados pelo lexer para a realização da análise sintática e criação da árvore de derivação
* Analisador Semantico - Composto principalmente de Listeners e Visitor, realiza a análise semântica da entrada a partir da árvore gerada 

## Comandos da linguagem aceita

* print --> IMPRIMIR 
* read --> LER
* int --> INTEIRO
* float --> REAL
* string --> 
* atribuir valor de variável à outra --> ATRIBUIR nomeVariavel A nomeVariavel
* criação de vairável --> nomeVariavel:Tipo
* if --> SE
* while --> ENQUANTO
* iniciar sub-algoritmo {  --> INICIO
* fechar sub_algoritmo }  --> FIM

## Funcionamento

1. Clone o repositório https://github.com/icaroQre/Compilador.git
2. 

## Exemplo entrada
```

:DECLARACOES
argumento:INTEIRO
fatorial:INTEIRO

:ALGORITMO

% Calcula o fatorial de um número inteiro
LER argumento
ATRIBUIR argumento A fatorial
SE argumento = 0 ENTAO ATRIBUIR 1 A fatorial

ENQUANTO argumento > 1
   INICIO
      ATRIBUIR fatorial * (argumento - 1) A fatorial
      ATRIBUIR argumento - 1 A argumento
   FIM
IMPRIMIR fatorial

```

## Saída do exemplo
```
#include <stdio.h>
#include <stdlib.h>

int argumento;
int fatorial;

int main() {
scanf("%d", &argumento);
fatorial = argumento;
if(argumento == 0)
fatorial = 1;
while(argumento > 1)
{
fatorial = fatorial * (argumento - 1);
argumento = argumento - 1;
}
printf("%d\n",fatorial);
}
```
