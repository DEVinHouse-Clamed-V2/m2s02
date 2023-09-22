package br.senai.lab365.devinhouse.aula3;

import br.senai.lab365.devinhouse.entidades.Conta;

public class TestaEstatico {
  public static void main(String[] args) {
    // int totalContas = Conta.totalContas;
    System.out.println(Conta.getTotalContas());

    Conta conta1 = new Conta();
    System.out.println(Conta.getTotalContas());

    Conta conta2 = new Conta();
    System.out.println(Conta.getTotalContas());
  }
}
