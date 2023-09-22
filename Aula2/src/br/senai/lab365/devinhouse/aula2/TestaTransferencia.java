package br.senai.lab365.devinhouse.aula2;

import br.senai.lab365.devinhouse.entidades.Cliente;
import br.senai.lab365.devinhouse.entidades.Conta;

public class TestaTransferencia {
    public static void main(String[] args){
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        Cliente titular = new Cliente();
        titular.setNome("Gabriel");
        c1.setTitular(titular);
        c1.depositar(200);

        Cliente titular2 = new Cliente();
        titular2.setNome("Maria");
        c2.setTitular(titular2);

        c1.transferir(c2, 50); // Conta outraConta = c2;

        System.out.printf("Saldo da c1 é R$%.2f%n", c1.getSaldo());
        System.out.printf("Saldo da c2 é R$%.2f%n", c2.getSaldo());
        System.out.println(c1);
  }
}
