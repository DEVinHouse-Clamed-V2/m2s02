package aula1;

public class Carro {
    int numPortas;
    String cor;
    String fabricante;
    int ano;
    boolean possuiEscada;
    private double velocidade;

    public double acelerar(double aceleracao) {
        this.velocidade = this.velocidade + aceleracao;
        return this.velocidade;
    }

    public double frear(double freada) {
        this.velocidade = this.velocidade - freada;
        return this.velocidade;
    }

    public double velocimetro() {
        return this.velocidade;
    }

    String pintar(String cor) {
        this.cor = cor;
        return this.cor;
    }
}
