
package exercicio_aula01.pedidos;

import exercicio_aula01.cadastros.Produto;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dilaz
 */
public class PedidoItem {
    private int id;
    private double quantidade;
    private double valorVenda;
    private double valorTotal;
    private Produto produto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
