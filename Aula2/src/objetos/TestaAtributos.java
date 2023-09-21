package objetos;

public class TestaAtributos {
    public static void main(String[] args){
        Conta contaTeste = new Conta();
        System.out.println(contaTeste);

        Cliente cli = new Cliente();
        cli.nome = "Henrique";
        cli.sobrenome = "Mafra";
        cli.cpf = "12312321";
        cli.email = "asds@adsa.com";

        contaTeste.titular = cli;

        contaTeste.titular.telefone = "48 99999999";

        contaTeste.dependente = new Cliente();
        contaTeste.dependente.nome = "Lucas";
        contaTeste.dependente.sobrenome = "Alves";
        contaTeste.dependente.cpf = "23423432";
    }
}
