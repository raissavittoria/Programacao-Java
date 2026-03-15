package ClassesObjetos;

public class Conta {

    // Atributos públicos
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status; // true = ativa | false = encerrada

    // Método construtor
    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    // Método depositar
    public void depositar(float valor) {
        if (status) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("ClassesObjetos.Conta inativa. Não é possível depositar.");
        }
    }

    // Método sacar
    public void sacar(float valor) {
        if (!status) {
            System.out.println("ClassesObjetos.Conta inativa.");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Método encerrarConta
    public void encerrarConta() {
        if (saldo == 0) {
            status = false;
            System.out.println("ClassesObjetos.Conta encerrada com sucesso.");
        } else {
            System.out.println("Não é possível encerrar a conta. Saque o saldo restante primeiro.");
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "ClassesObjetos.Conta {" +
                "Número: " + numeroConta +
                ", Agência: " + agencia +
                ", Cliente: " + nomeCliente +
                ", Saldo: R$ " + saldo +
                ", Status: " + (status ? "Ativa" : "Encerrada") +
                '}';
    }
}