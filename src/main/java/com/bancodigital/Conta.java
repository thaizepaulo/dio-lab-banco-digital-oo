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
        saldo += valor;
    }

    private boolean saldoSuficiente(double valor) {
        if (saldo < valor) {
            return false;
        }
        return true;
    }

    private void debitar(double valor) {
        saldo -= valor;
    }

    @Override
    public void sacar(double valor) {
        if (!saldoSuficiente(valor)) {
            System.out.println("Saque não realizado: Saldo Insuficiente.");
            return;
        }
        saldo -= valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (!saldoSuficiente(valor)) {
            System.out.println("Transferência não realizada. Saldo Insuficiente.");
            return;
        }
        this.debitar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
