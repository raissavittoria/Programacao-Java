package ClassesObjetos;

public class Conta2 {

    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    // Construtor
    public Conta2(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    // Depositar
    public void depositar(float valor) {
        if (status) {
            saldo += valor;
            System.out.println("Depósito realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("ClassesObjetos.Conta inativa.");
        }
    }

    // Sacar
    public void sacar(float valor) {
        if (!status) {
            System.out.println("ClassesObjetos.Conta inativa.");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Encerrar conta
    public void encerrarConta() {
        if (saldo == 0) {
            status = false;
            System.out.println("ClassesObjetos.Conta encerrada.");
        } else {
            System.out.println("Saque o dinheiro antes de encerrar a conta.");
        }
    }

    // toString
    public String toString() {
        String situacao = status ? "Ativa" : "Encerrada";

        return "ClassesObjetos.Conta: " + numeroConta +
                "\nAgência: " + agencia +
                "\nCliente: " + nomeCliente +
                "\nSaldo: R$ " + saldo +
                "\nStatus: " + situacao;
    }
}