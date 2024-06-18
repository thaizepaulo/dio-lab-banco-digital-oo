# Criando um Banco Digital com Java e Orientação a Objetos

## 02/08/2021 - [Mentoria #1: Tire Suas Dúvidas Sobre Orientação a Objetos](https://www.youtube.com/watch?v=YS6ouOhkyNI)

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

## Projeto Base - [lab-banco-digital-oo](https://github.com/falvojr/lab-banco-digital-oo)

## Melhorias (Desafios Propostos):

### Gestão de Dependências com Maven
Foi feita a restruturação do código para permitir que o Maven faça a gestão de dependências.

### Utilização de bibliotecas
Foí utilizada a biblioteca Lombok para reduzir a verbosidade de código. 

### Validações
Foram feitas algumas validações de forma bem simples:

- Saque: Valida se o saldo é suficiente e retorna uma mensagem caso não seja.
- Transferência: Valida se o saldo é suficiente e retorna uma mensagem caso não seja.