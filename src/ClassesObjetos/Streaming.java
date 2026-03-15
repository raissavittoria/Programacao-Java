package ClassesObjetos;

public class Streaming {

    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;

        if (plano.equals("Básico")) {
            mensalidade = 25.90f;
        } else if (plano.equals("Premium")) {
            mensalidade = 45.90f;
        } else if (plano.equals("Família")) {
            mensalidade = 60.90f;
        }

        ativo = true;
        ultimoFilmeAssistido = "";
    }

    public void assistirFilme(String nomeFilme) {
        if (ativo) {
            ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("ClassesObjetos.Conta suspensa. Pague a fatura.");
        }
    }

    public void cancelarAssinatura() {
        ativo = false;
    }

    public String toString() {

        String status = ativo ? "Ativo" : "Suspenso";

        return "Usuário: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: $" + mensalidade +
                "\nStatus: " + status +
                "\nÚltimo filme: " + ultimoFilmeAssistido;
    }
}