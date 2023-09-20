package aula1;

public class Main {
    public static void main(String[] args) {
        Carro unoDeFirma = new Carro();
        unoDeFirma.cor = "Branco";
        unoDeFirma.possuiEscada = true;
        unoDeFirma.ano = 2005;
        unoDeFirma.numPortas = 2;

        double velocidadeDoUninho = unoDeFirma.acelerar(2);
        velocidadeDoUninho = unoDeFirma.acelerar(3);

        System.out.println(unoDeFirma.velocimetro());

        Carro sandero = new Carro();
        sandero.cor = "Prata";
        sandero.possuiEscada = false;
        sandero.ano = 2015;
        sandero.numPortas = 4;

        sandero.acelerar(3);
        sandero.acelerar(5);
        double velocidadeDoSandero = sandero.frear(2);

        System.out.println(sandero.velocimetro());
    }
}