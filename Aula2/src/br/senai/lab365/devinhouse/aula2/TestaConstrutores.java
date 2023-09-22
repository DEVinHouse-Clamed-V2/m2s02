package br.senai.lab365.devinhouse.aula2;

import br.senai.lab365.devinhouse.entidades.Cliente;
import br.senai.lab365.devinhouse.entidades.Conta;

public class TestaConstrutores {
    public static void main(String[] args){
        Conta conta = new Conta(new Cliente(),100);
    }
}
