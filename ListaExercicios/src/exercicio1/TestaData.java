package exercicio1;

import java.time.LocalDate;
import java.util.Scanner;

public class TestaData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano:");
        int ano = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite um mês:");
        int mes = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite um dia:");
        int dia = Integer.parseInt(scanner.nextLine());

        Data novaData = new Data(dia, mes, ano);

        System.out.println(novaData.exibirData());
  }
}
