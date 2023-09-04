# Trabalho 6 - Linguagem TFT

## Feito pelos alunos:
 - Gabriel Penajo Machado. RA: 769712
 - Isabela Vieira Magalhães. RA: 769755
 - Matheus Teixeira Mattioli. RA: 769783

## Introdução

Repositório dedicado ao desenvolvimento do compilador para uma linguagem lúdica nomeada de linguagem TFT. 
Ela se baseia no jogo online de tabuleiros chamado Teamfight Tactics da empresa Riot Games, no qual o objetivo é montar sua composição de heróis e vencer a composição adversária. 
Cada herói tem uma lista de características, ao formar uma composição no tabuleiro com esses heróis, as características são contabilizadas para ativar sinergias,
que fornecem _buffs_ (benefícios) para a composição.

Um exemplo de entrada é 

```
// codigo a ser compilado

caracteristica atirador // define atirador na gramática
caracteristica mago // define mago na gramática

caracteristica freljord // define freljord na gramática
caracteristica ionia // define ionia na gramática
caracteristica demacia // define demacia na gramática

sinergia freljord1 requer 2 freljord // especifica a quantidade de unidades diferentes daquela característica
sinergia freljord2 requer 4 freljord // especifica a quantidade de unidades diferentes daquela característica
sinergia mago1 requer 1 mago // especifica a quantidade de unidades diferentes daquela característica
sinergia atirador1 requer 2 atirador // especifica a quantidade de unidades diferentes daquela característica
sinergia demacia1 requer 1 demacia // especifica a quantidade de unidades diferentes daquela característica
sinergia demacia2 requer 2 demacia // especifica a quantidade de unidades diferentes daquela característica

unidade ashe representa atirador, freljord
unidade lissandra representa freljord, mago
unidade sejuani representa freljord
unidade olaf representa freljord
unidade jhin representa atirador, ionia
unidade lux representa demacia, mago
unidade lucian representa demacia, atirador

encontrar sinergias para ashe, jhin, lissandra, sejuani, olaf // retorna quais sinergias podem ser feitas
encontrar composicao para freljord1, demacia2 // retorna quais campeões são necessários 

// saida gerada

// ashe, jhin, lissandra formam freljord1, atirador1
``` 
Para desenvolvimento do compilador responsável por gerar análise léxica, sintática e semântica, além da geração de código, foi implementado em Python 3 e ANTLR4.

## Requisitos
 - Antlr 4.13 (https://github.com/antlr/antlr4/blob/master/doc/python-target.md)
 - Python 3 (https://www.python.org/downloads/)

## Execução

Vídeo explicando o funcionamento da linguagem e o modo de execução.  

https://github.com/gabrielpenajo/CC-T6/assets/55462743/a450e506-b600-4b37-99c3-be6cf31db95e


