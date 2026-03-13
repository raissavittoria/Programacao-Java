public class ItemVenda {

    private int id;
    private int qtd;
    private float valorUnitario;

    public ItemVenda(int id, int qtd, float valorUnitario) {
        this.id = id;
        this.qtd = qtd;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return id;
    }

    public int getQtd() {
        return qtd;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "id=" + id +
                ", qtd=" + qtd +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}