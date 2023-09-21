package objetos;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.printf("a=%d, b=%d", a, b);

        b = 20;

        System.out.printf("%na=%d, b=%d", a, b);


        Cliente titular1 = new Cliente();
        Conta c1 = new Conta(titular1);
        c1.depositar(100);
        System.out.printf("%nSaldo de c1 é R$%.2f", c1.getSaldo());

        Conta c2 = c1;
        c2.depositar(200);
        System.out.printf("%nSaldo de c1 é R$%.2f", c1.getSaldo());
        System.out.printf("%nSaldo de c2 é R$%.2f", c2.getSaldo());
        System.out.println();
        System.out.println(c1);
        System.out.println(c2);

        if (c1==c2) {
            System.out.println("são o mesmo objeto");
        }

        Conta conta1 = new Conta();
        conta1.titular = new Cliente();
        conta1.titular.nome = "João";
        conta1.depositar(10);

        Conta conta2 = new Conta();
        conta2.titular = new Cliente();
        conta2.titular.nome = "João";
        conta2.depositar(10);

        if (conta1==conta2) {
            System.out.println("são o mesmo objeto");
        } else {
            System.out.println("não são o mesmo objeto");
            System.out.println(conta1);
            System.out.println(conta2);
        }
    }
}