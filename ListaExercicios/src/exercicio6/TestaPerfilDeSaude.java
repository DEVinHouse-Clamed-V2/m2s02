package exercicio6;

import java.util.Scanner;

public class TestaPerfilDeSaude {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso em kg:");
        double peso = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite sua altura em m:");
        double altura = Double.parseDouble(scanner.nextLine());

        PerfilDeSaude perfilDeSaude = new PerfilDeSaude("", "", "25/02/1991",
                "", altura, peso);

        System.out.println(perfilDeSaude.imc());
  }
}
