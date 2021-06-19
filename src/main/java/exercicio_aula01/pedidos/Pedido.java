package exercicio_aula01.pedidos;

import exercicio_aula01.cadastros.Cadastro;
import exercicio_aula01.cadastros.Empresa;
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
    private Integer ccf;
    private Integer coo;
    private Empresa empresa;

    public Integer getCcf() {
        return ccf;
    }

    public void setCcf(Integer ccf) {
        this.ccf = ccf;
    }

    public Integer getCoo() {
        return coo;
    }

    public void setCoo(Integer coo) {
        this.coo = coo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    private List<PedidoItem> itens;

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
