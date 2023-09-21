package objetos;

public class Conta {
    Cliente titular;
    Cliente dependente;
    private double saldo;
    boolean ativa;

    public Conta() {}

    public Conta(Cliente titular) {
        this.titular = titular;
    }

    public Conta(Cliente titular, double saldo) {
        this(titular);
        this.saldo = saldo;
    }

    public Conta(String nomeTitular, String sobrenomeTitular, String cpfTitular) {
        Cliente titular = new Cliente();
        titular.nome = nomeTitular;
        titular.sobrenome = sobrenomeTitular;
        titular.cpf = cpfTitular;
    }

    boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Não foi possível realizar o saque. Consulte seu saldo.");
            return false;
        }
    }

    void depositar(double valor) {
        // this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    double getSaldo() {
        return this.saldo;
    }

    public void transferir(Conta outraConta, double valor) {
        if (this.sacar(valor)) {
            outraConta.depositar(valor);
        }
    }

    public String toString() {
        return String.format("nomeTitular: %s, saldo: %.2f",
                this.titular.nome, this.getSaldo());
    }
}
