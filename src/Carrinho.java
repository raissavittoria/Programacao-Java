import java.util.ArrayList;

public class Carrinho {

    private String nomeLoja;
    private ArrayList<Produto> produtos;
    private ArrayList<ItemVenda> itensVenda;

    public Carrinho(String nomeLoja) {
        this.nomeLoja = nomeLoja;
        produtos = new ArrayList<>();
        itensVenda = new ArrayList<>();
    }

    // Agregação
    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    // Composição
    public void gerarItem(int id, int qtd, float valor) {
        ItemVenda item = new ItemVenda(id, qtd, valor);
        itensVenda.add(item);
    }

    public void removerItem(int id) {
        itensVenda.removeIf(item -> item.getId() == id);
    }

    public void exibirCarrinho() {
        System.out.println("Loja: " + nomeLoja);
        System.out.println("Produtos no carrinho:");

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "nomeLoja='" + nomeLoja + '\'' +
                ", produtos=" + produtos +
                ", itensVenda=" + itensVenda +
                '}';
    }
}