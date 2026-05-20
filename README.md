# Monitoramento de Vegetacao nas Rodovias

Sprint 1 OBJECT-ORIENTED PROGRAMMING.

O objetivo e construir um sistema de monitoramento e priorizacao de rocada de vegetacao nas rodovias. A ideia e criar um prototipo simples em console para representar trechos de rodovia, registrar o crescimento da vegetacao e indicar qual trecho precisa de uma equipe de manutencao.

## Integrantes

- Bruno Anselmo Da Silva - RM 566521
- Fernando de Almeida Godoi - RM 564820
- Gabriel Ber Soares - RM 563520
- Guilherme de Freitas Salgado - RM 562494
- Vinicius Ribeiro Dias - RM 566468

## O que foi implementado

- Classe `TrechoRodovia`, com `quilometroInicial`, `quilometroFinal` e `nivelVegetacao`.
- Classe `EquipeManutencao`, para representar a equipe responsavel pela rocada.
- Dois trechos de rodovia criados no `Main`.
- Metodo `registrarCrescimento(double taxa)` para simular o aumento da vegetacao.
- Atributo `nivelVegetacao` privado, com validacao para nao aceitar valor negativo.
- Associacao da equipe de manutencao ao trecho com nivel critico de vegetacao.

## Estrutura

```text
src/
|-- Main.java
`-- model/
    |-- TrechoRodovia.java
    `-- EquipeManutencao.java
```

## Reflexoes

**Por que `TrechoRodovia` e uma classe e "BR-116 KM 10 ao 15" e um objeto?**

`TrechoRodovia` e uma classe porque representa a ideia geral de um trecho de rodovia, com atributos e comportamentos. "BR-116 KM 10 ao 15" e um objeto porque e um trecho especifico criado a partir dessa classe.

**Como um metodo difere de uma funcao solta em programacao estruturada?**

Um metodo pertence a uma classe ou a um objeto. Ele pode usar e alterar os dados desse objeto. Uma funcao solta executa uma tarefa sem estar ligada diretamente a uma instancia.

**Se `nivelVegetacao` fosse publico, que tipo de quebra poderia acontecer?**

Um programador poderia colocar um valor invalido, como `-5`. Isso quebraria a regra de negocio, porque a vegetacao nao pode ter altura negativa, e tambem poderia atrapalhar a priorizacao dos trechos.
