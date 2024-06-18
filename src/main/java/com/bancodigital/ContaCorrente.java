package com.bancodigital;

import lombok.Getter;

@Getter
public class ContaCorrente extends Conta{

    private double limiteChequeEspecial;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public double getSaldo() {
        return super.getSaldo() + getLimiteChequeEspecial();
    }

    public void alterarLimiteChequeEspecial(double valor) {
        limiteChequeEspecial = valor;
        System.out.println("Limite de Cheque Especial alterado para " + getLimiteChequeEspecial());
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Cheque Especial: %.2f", getLimiteChequeEspecial()));
        System.out.println("==============================");
    }
}
