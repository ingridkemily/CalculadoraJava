# Calculadora Java

## Descrição
Este projeto é uma implementação simples de uma calculadora em Java, juntamente com testes unitários para as operações matemáticas básicas, incluindo soma, subtração, multiplicação e divisão.

## Estrutura do Projeto

O projeto é organizado da seguinte forma:

- `Calculadora` (interface): Define uma interface que contém as quatro operações matemáticas. Cada operação é definida em classes internas.
- `Soma`, `Subtracao`, `Multiplicacao`, `Divisao` (classes internas): Implementam as operações matemáticas correspondentes, cada uma fornecendo um método específico para realizar a operação.

## Funcionalidades

Este projeto oferece as seguintes funcionalidades:

- **Soma**: A classe `Soma` permite realizar a operação de adição de dois números inteiros.
- **Subtração**: A classe `Subtracao` permite realizar a operação de subtração de dois números inteiros.
- **Multiplicação**: A classe `Multiplicacao` permite realizar a operação de multiplicação de dois números inteiros.
- **Divisão**: A classe `Divisao` permite realizar a operação de divisão de dois números inteiros, com tratamento para divisão por zero.

## Testes Unitários

Para garantir a precisão das operações matemáticas, foram criados testes unitários para cada operação. Os testes estão localizados em classes separadas, como `TesteSoma`, `TesteSubtracao`, `TesteMultiplicacao` e `TesteDivisao`.

Cada classe de teste inclui vários cenários para testar diferentes casos, como:

- Operações com números positivos.
- Operações com números negativos.
- Operações com zero.
- Operações que envolvem exceções, como divisão por zero.

Os testes são executados para verificar se as operações produzem os resultados esperados e se o tratamento de exceções está correto.

## Como Executar

Para executar os testes, siga estas etapas:

1. Certifique-se de que você tenha o ambiente de desenvolvimento Java configurado em seu sistema.
2. Compile as classes e os testes utilizando seu IDE ou o compilador Java.
3. Execute as classes de teste (por exemplo, `TesteSoma`, `TesteSubtracao`, `TesteMultiplicacao`, `TesteDivisao`) para verificar o funcionamento das operações matemáticas.

## Contribuição

Este projeto é uma implementação básica de uma calculadora em Java com testes unitários. Você é bem-vindo para contribuir com melhorias, novas funcionalidades e otimizações.

## Autor

Este projeto foi desenvolvido por Ingrid Kemily.

## Versão

A versão atual deste projeto é 2.0, lançada em Novembro de 2023.

