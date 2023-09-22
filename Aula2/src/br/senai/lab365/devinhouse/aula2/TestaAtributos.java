package br.senai.lab365.devinhouse.aula2;

import br.senai.lab365.devinhouse.entidades.Cliente;
import br.senai.lab365.devinhouse.entidades.Conta;

public class TestaAtributos {
    public static void main(String[] args){
        Conta contaTeste = new Conta();
        System.out.println(contaTeste);

        Cliente cli = new Cliente();
        cli.setNome("Henrique");
        cli.setSobrenome("Mafra");
        cli.setCpf("12312321");
        cli.setEmail("asds@adsa.com");

        contaTeste.setTitular(cli);

        contaTeste.getTitular().setTelefone("48 99999999");

        Cliente dependente = new Cliente();
        dependente.setNome("Lucas");
        dependente.setSobrenome("Alves");
        dependente.setCpf("23423432");

        contaTeste.setDependente(dependente);
    }
}
