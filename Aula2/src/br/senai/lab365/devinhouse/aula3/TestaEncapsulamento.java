package br.senai.lab365.devinhouse.aula3;

import br.senai.lab365.devinhouse.entidades.Cliente;
import br.senai.lab365.devinhouse.entidades.Conta;

public class TestaEncapsulamento {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setNome("João Victor");
        cliente.setSobrenome("Oliveira");
        cliente.setCpf("12312321");

        Conta minhaConta = new Conta(cliente, 50, 100);

        minhaConta.sacar(60);
        System.out.printf("Novo saldo da conta é: R$%.2f", minhaConta.getSaldo());
    }
}
