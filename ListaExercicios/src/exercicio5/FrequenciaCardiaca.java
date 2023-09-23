package exercicio5;

import utils.SaudeUtils;

import java.time.LocalDate;

public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private String dataNascimento;

    public FrequenciaCardiaca(String nome, String sobrenome, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int calculaIdade() {
        return SaudeUtils.calculaIdade(this.dataNascimento);
    }

    public int frequenciaCardiacaMaxima() {
        return 220 - calculaIdade();
    }

    public double[] frequenciaCardiacaAlvo() {
        double[] intervaloFreqCardAlvo = new double[2];
        intervaloFreqCardAlvo[0] = frequenciaCardiacaMaxima() * 0.5;
        intervaloFreqCardAlvo[1] = frequenciaCardiacaMaxima() * 0.85;

        return intervaloFreqCardAlvo;
    }

}
