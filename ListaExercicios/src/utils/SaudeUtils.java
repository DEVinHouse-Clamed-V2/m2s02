package utils;

import java.time.LocalDate;

public class SaudeUtils {
    public static int calculaIdade(String dataNascimento) {
        // dataNascimento: dd/MM/YYYY. Ex.: "25/02/1991"
        LocalDate atual = LocalDate.now();
        int anoAtual = atual.getYear();
        int mesAtual = atual.getMonthValue();
        int diaAtual = atual.getDayOfMonth();

        String[] dataNasc = dataNascimento.split("/");
        // ["25", "02", "1991"]

        int anoNascimento = Integer.parseInt(dataNasc[2]);
        int mesNascimento = Integer.parseInt(dataNasc[1]);
        int diaNascimento = Integer.parseInt(dataNasc[0]);

        int idade = anoAtual - anoNascimento;
        if (mesAtual < mesNascimento) {
            idade--;
        } else if (mesAtual == mesNascimento) {
            if (diaAtual < diaNascimento) {
                idade--;
            }
        }

        return idade;
    }
}
