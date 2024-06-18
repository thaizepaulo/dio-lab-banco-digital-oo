package com.bancodigital;

public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.sacar(50);
        cc.transferir(50, poupanca);
        cc.sacar(100);
        poupanca.transferir(100, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
