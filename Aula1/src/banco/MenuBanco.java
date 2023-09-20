package banco;

import java.util.Scanner;

public class MenuBanco {
    public static void main(String[] args){

        Conta conta = new Conta();
        conta.nomeTitular = "André";

        System.out.println("Escolha uma opção de operação:");
        System.out.println("1 - Deposito");
        System.out.println("2 - Saque");
        System.out.println("3 - Ver Saldo");
        System.out.println("0 - Sair");

        Scanner scanner = new Scanner(System.in);
        int decisao = Integer.parseInt(scanner.nextLine());
        switch(decisao) {
            case 1:
                trataDeposito(conta, scanner);
                break;
            case 2:
                trataSaque(conta, scanner);
                break;
            case 3:
                trataSaldo(conta);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    private static void trataDeposito(Conta conta, Scanner scanner) {
        System.out.println("Qual valor vc deseja depositar?");
        double valorDeposito = Double.parseDouble(scanner.nextLine());

        conta.depositar(valorDeposito);
    }

    private static void trataSaque(Conta conta, Scanner scanner) {
        System.out.println("Qual valor vc deseja sacar?");
        double valorSaque = Double.parseDouble(scanner.nextLine());

        conta.sacar(valorSaque);
    }

    private static void trataSaldo(Conta conta) {
        System.out.printf("Saldo do cliente %s é R$%.2f", conta.nomeTitular, conta.getSaldo());

    }
}
