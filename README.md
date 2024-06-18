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

### Alterações no código
Foram feitas algumas melhorias no código, como criação de novos métodos e validações:

- Criação do método saldoSuficiente na classe conta que verifica se o saldo é suficiente em referencia ao valor passado por parâmetro.
- Criação do método debitar para ser utilizado nos métodos saque e transferência, permitindo assim informar qual tipo de transação está sendo feita na mensagem enviada quando o saldo é insuficiente.
- Alteração nos métodos saque e transferência, validando se o saldo é suficiente, retornando uma mensagem caso não seja.
- Inclusão do atributo limiteChequeEspecial na Classe ContaCorrente, com get e set deste atributo (utilizando a biblioteca Lombok).
- Sobreposição do método getSaldo retornando o valor do saldo mais o valor do limite do cheque especial na classe Conta Corrente.