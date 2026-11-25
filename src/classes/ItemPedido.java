package classes;

public class ItemPedido {
    private int qtde;
    private Produto produto;
    private Pedido pedido;

    public ItemPedido(int qtde, Produto produto, Pedido pedido) {
        this.qtde = qtde;
        this.produto = produto;
        this.pedido = pedido;
    }

    public int getQtde() {
        return qtde;
    }

    public Produto getProduto() {
        return produto;
    }

    public Pedido getPedido() {
        return pedido;
    }
}
