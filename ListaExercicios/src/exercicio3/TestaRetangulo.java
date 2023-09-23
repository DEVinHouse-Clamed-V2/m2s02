package exercicio3;

import java.util.Scanner;

public class TestaRetangulo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para largura:");
        double largura = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite um valor para comprimento:");
        double comprimento = Double.parseDouble(scanner.nextLine());

        Retangulo retangulo = new Retangulo();
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        System.out.printf("Perímetro: %.2f%n", retangulo.perimetro());
        System.out.printf("Área: %.2f%n", retangulo.area());
  }
}
