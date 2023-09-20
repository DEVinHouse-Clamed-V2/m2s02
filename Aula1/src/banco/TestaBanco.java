package banco;

import java.util.Scanner;

public class TestaBanco {

    public static void main(String[] args){
        Conta conta = new Conta();
        conta.nomeTitular = "André Ricardo Santos";
        conta.depositar(100);
        conta.sacar(50);

        String nomeDoTitular = conta.nomeTitular;

        System.out.printf("A conta do cliente %s possui R$%.2f de saldo.%n",
                nomeDoTitular, conta.getSaldo());

        Conta outraConta = new Conta();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInsira um nome para o titular:");

        outraConta.nomeTitular = scanner.nextLine();

        System.out.println("Insira um valor de depósito inicial:");
        double valorDepositoInicial = Double.parseDouble(scanner.nextLine());

        outraConta.depositar(valorDepositoInicial);

        System.out.println("Você deseja consultar o saldo da sua conta? Y/n");

        String decisao = scanner.nextLine();

        if ("Y".equalsIgnoreCase(decisao)) {
            System.out.printf("O saldo da sua conta é: R$%.2f", outraConta.getSaldo());
        }
  }
}
