
package pedidos;

import cadastros.Cadastro;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dilaz
 */
public class Pedido {
    private int id;
    private Date data;
    private double valorTotal;
    private Cadastro comprador; 
    private List <PedidoItem> itens;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cadastro getComprador() {
        return comprador;
    }

    public void setComprador(Cadastro comprador) {
        this.comprador = comprador;
    }

    public List<PedidoItem> getItens() {
        return itens;
    }

    public void setItens(List<PedidoItem> itens) {
        this.itens = itens;
    }
    
    
}
