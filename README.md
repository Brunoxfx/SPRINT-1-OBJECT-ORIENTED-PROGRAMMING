# Monitoramento de Vegetacao em Rodovias

Prototipo em console para a Sprint 1 do Challenge. O sistema modela trechos de rodovia, simula o crescimento da vegetacao e associa uma equipe de manutencao ao trecho considerado critico.

## O que foi implementado

- Classe `TrechoRodovia`, com `quilometroInicial`, `quilometroFinal` e `nivelVegetacao`.
- Classe `EquipeManutencao`, representando a equipe responsavel pela rocada.
- Instanciacao de dois trechos diferentes no `Main`.
- Metodo `registrarCrescimento(double taxa)`, que aumenta o nivel da vegetacao.
- Encapsulamento de `nivelVegetacao`, impedindo valores negativos.
- Associacao de uma equipe de manutencao ao trecho critico.

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

`TrechoRodovia` e uma classe porque define o modelo geral de um trecho de rodovia, com seus atributos e comportamentos. "BR-116 KM 10 ao 15" e um objeto porque representa um trecho especifico criado a partir dessa classe.

**Como um metodo difere de uma funcao solta em programacao estruturada?**

Um metodo pertence a uma classe ou objeto e normalmente altera ou consulta o estado desse objeto. Uma funcao solta executa uma tarefa sem estar diretamente ligada a uma instancia.

**Se `nivelVegetacao` fosse publico, que tipo de quebra poderia acontecer?**

Um programador poderia alterar o valor diretamente para algo invalido, como `-5`. Isso quebraria a regra de negocio, pois a vegetacao nao pode ter altura negativa, e prejudicaria a previsao e a priorizacao dos trechos.
