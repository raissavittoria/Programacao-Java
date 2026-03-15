package Agregacao;

public class TestaLoja {

    public static void main(String[] args) {

        Produto mouse = new Produto(1, "Mouse", 50);
        Produto teclado = new Produto(2, "Teclado", 120);
        Produto monitor = new Produto(3, "Monitor", 900);

        Carrinho carrinho = new Carrinho("Loja Tech");

        carrinho.adicionarProduto(mouse);
        carrinho.adicionarProduto(teclado);
        carrinho.adicionarProduto(monitor);

        carrinho.gerarItem(1, 2, 50);
        carrinho.gerarItem(2, 1, 120);

        System.out.println(carrinho);
    }
}
