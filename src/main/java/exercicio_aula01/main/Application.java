package exercicio_aula01.main;

import exercicio_aula01.cadastros.Cadastro;
import exercicio_aula01.cadastros.Empresa;
import exercicio_aula01.cadastros.Instrumento;
import exercicio_aula01.factory.FabricaCadastro;
import static exercicio_aula01.main.PrinterApp.imprimirPedido;
import exercicio_aula01.pedidos.Pedido;
import exercicio_aula01.pedidos.PedidoItem;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dilaz
 */
public class Application {

    public static void main(String[] args) throws ParseException {
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

        Empresa empresa=new Empresa(963521487l,54763215l);
        Cadastro cadEmpresa = new Cadastro();
        cadEmpresa.setCpfCnpj("785.426.785/0065-30");
        cadEmpresa.setEmail("giannini@giannini.com");
        cadEmpresa.setEndereco("Av. Tranquillo Giannini, 700 - Dist. Indus., Salto - SP, 13329-600");
        cadEmpresa.setNome("Giannini Brasil");
        cadEmpresa.setTelefone(11948752528l);
        empresa.setCadastro(cadEmpresa);
        
        Pedido p = new Pedido();
        p.setEmpresa(empresa); //importante
        
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
//imprimirPedido(p);
        PrinterApp.imprimirPedido(p);
//        System.out.println("Pedido Cliente " + p.getComprador().getNome());
//        for (PedidoItem i : p.getItens()) {
//            System.out.println(i.getProduto().getTitulo() + " " + i.getValorVenda() + " " + i.getValorTotal());
//        }
    }
}
