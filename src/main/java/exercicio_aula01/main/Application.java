package main;

import cadastros.Cadastro;
import cadastros.Instrumento;
import factory.FabricaCadastro;
import pedidos.Pedido;
import pedidos.PedidoItem;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dilaz
 */
public class Application {

    public static void main(String[] args) {
        Cadastro tipo = FabricaCadastro.criarCadastro("Tagima", "instrumentos@gmail.com", 787171798411l);

        Instrumento instru = new Instrumento();
        instru.setCodigoBarras("78287877854655646887845145");
        instru.setTitulo("Violão");
        instru.setValorVenda(1500.00);
        instru.setMarca("Eagle");
        instru.setTipoInstrumento(tipo);

        tipo = FabricaCadastro.criarCadastro("Giannini CiA", "giann@gmail.com", 32155478852486l);

        Instrumento instru2 = new Instrumento();
        instru2.setTitulo("Cordas");
        instru2.setValorVenda(25.36);
        instru2.setMarca("Giannini");
        instru2.setTipoInstrumento(tipo);

        tipo = FabricaCadastro.criarCadastro("Giannini CiA", "giann@gmail.com", 32155478852486l);

        Instrumento instru3 = new Instrumento();
        instru3.setTitulo("Capotraste");
        instru3.setValorVenda(9.99);
        instru3.setMarca("Giannini");
        instru3.setTipoInstrumento(tipo);

        tipo = FabricaCadastro.criarCadastro("Giannini CiA", "giann@gmail.com", 32155478852486l);

        Instrumento instru4 = new Instrumento();
        instru4.setTitulo("Capa de Violão");
        instru4.setValorVenda(89.95);
        instru4.setMarca("Eagle");
        instru4.setTipoInstrumento(tipo);
        
        tipo = FabricaCadastro.criarCadastro("Alice Palhetas", "alice@gmail.com", 4546484484461116l);

        Instrumento instru5 = new Instrumento();
        instru5.setTitulo("Palheta");
        instru5.setValorVenda(5.99);
        instru5.setMarca("Alice");
        instru5.setTipoInstrumento(tipo);

        Pedido p = new Pedido();
        Cadastro cliente = FabricaCadastro.criarCadastro("Lila", "lilalinda@gmail.com", 1516346151l);

        p.setComprador(cliente);
        p.setData(new Date(2021, 4, 25));
        p.setValorTotal(15344.72);
        p.setId(6976);

        List<PedidoItem> itens = new ArrayList<>();
        PedidoItem item = new PedidoItem();
        item.setProduto(instru);
        item.setQuantidade(5);
        item.setValorVenda(instru.getValorVenda());
        item.setValorTotal(item.getQuantidade() * item.getValorVenda());

        itens.add(item);

        item = new PedidoItem();
        item.setProduto(instru2);
        item.setQuantidade(2.0);
        item.setValorVenda(instru2.getValorVenda());
        item.setValorTotal(item.getQuantidade() * item.getValorVenda());
        
        itens.add(item);

        item = new PedidoItem();
        item.setProduto(instru3);
        item.setQuantidade(75);
        item.setValorVenda(instru3.getValorVenda());
        item.setValorTotal(item.getQuantidade() * item.getValorVenda());
        
        itens.add(item);

        item = new PedidoItem();
        item.setProduto(instru4);
        item.setQuantidade(65);
        item.setValorVenda(instru4.getValorVenda());
        item.setValorTotal(item.getQuantidade() * item.getValorVenda());
        
        itens.add(item);

        item = new PedidoItem();
        item.setProduto(instru5);
        item.setQuantidade(200);
        item.setValorVenda(instru5.getValorVenda());
        item.setValorTotal(item.getQuantidade() * item.getValorVenda());

        itens.add(item);
        p.setItens(itens);

        System.out.println("Pedido Cliente " + p.getComprador().getNome());
        for (PedidoItem i : p.getItens()) {
            System.out.println(i.getProduto().getTitulo() + " " + i.getValorVenda() + " " + i.getValorTotal());
        }
    }
}
