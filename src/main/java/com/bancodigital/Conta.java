package com.bancodigital;

import lombok.Getter;

@Getter
public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        creditar(valor);
        System.out.println("Deposito Realizado. Saldo: " + getSaldo());
    }

    private boolean saldoSuficiente(double valor) {
        return (getSaldo() > valor);
    }

    private void creditar(double valor) {
        saldo += valor;
    }

    private void debitar(double valor) {
        saldo -= valor;
    }

    @Override
    public void sacar(double valor) {
        if (!saldoSuficiente(valor)) {
            System.out.println("Saque não realizado: Saldo Insuficiente: " + getSaldo());
            return;
        }
        saldo -= valor;
        System.out.println("Saque Realizado. Saldo: " + getSaldo());
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (!saldoSuficiente(valor)) {
            System.out.println("Transferência não realizada. Saldo Insuficiente: " + getSaldo());
            return;
        }
        this.debitar(valor);
        contaDestino.creditar(valor);
        System.out.println("Transferência Realizada. Saldo: " + getSaldo());
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", getCliente().getNome()));
        System.out.println(String.format("Agencia: %d", getAgencia()));
        System.out.println(String.format("Numero: %d", getNumero()));
        System.out.println(String.format("Saldo: %.2f", getSaldo()));
    }
}
