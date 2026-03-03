public class TestaConta {

    public static void main(String[] args) {

        // Criando conta c1
        Conta c1 = new Conta(1, 1234, "João Silva");

        // Depósito de R$ 500
        c1.depositar(500);

        // Saque de R$ 200
        c1.sacar(200);

        // Imprimir estado da conta
        System.out.println(c1);

        System.out.println("----------------------");

        // Criando conta c2
        Conta c2 = new Conta(2, 5678, "Maria Souza");

        // Tentando sacar R$ 50 sem saldo
        System.out.println("Tentando sacar R$ 50 da conta c2");
        c2.sacar(50);

        System.out.println("----------------------");

        // Tentando encerrar c1 com saldo
        c1.encerrarConta();

        System.out.println("----------------------");

        // Sacando restante do saldo de c1
        c1.sacar(300);

        // Encerrando conta
        c1.encerrarConta();

        // Imprimindo dados finais
        System.out.println(c1);
    }
}