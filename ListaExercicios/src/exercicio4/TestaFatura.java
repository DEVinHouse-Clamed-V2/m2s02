package exercicio4;

public class TestaFatura {
    public static void main(String[] args){
        Fatura fatura = new Fatura("123", "venda de 5 itens",
                5, 21.0);

        System.out.println(fatura.getValorFatura());
  }
}
