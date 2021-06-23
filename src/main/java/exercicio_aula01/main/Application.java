package exercicio_aula01.main;

import exercicio_aula01.utils.PrinterApp;
import exercicio_aula01.cadastros.Cadastro;
import exercicio_aula01.cadastros.Empresa;
import exercicio_aula01.cadastros.Endereco;
import exercicio_aula01.cadastros.Instrumento;
import exercicio_aula01.factory.FabricaCadastro;
import exercicio_aula01.pedidos.Pedido;
import exercicio_aula01.pedidos.PedidoItem;
import exercicio_aula01.service.CupomService;
import java.io.File;
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
        
        Empresa empresa = new Empresa(963521487L, 54763215L);
        Cadastro cadEmpresa = new Cadastro();
        cadEmpresa.setCpfCnpj("78542678006530");
        cadEmpresa.setEmail("giannini@giannini.com");
//        cadEmpresa.setEndereco("Av. Tranquillo Giannini, 700 - Dist. Indus., Salto - SP, 13329-600");
        cadEmpresa.setNome("Giannini Brasil");
        cadEmpresa.setTelefone(11948752528l);
        empresa.setCadastro(cadEmpresa);
        
        Endereco end = new Endereco();
        end.setLogradouro("Av. Tranquillo Giannini");
        end.setNumero("700");
        end.setCidade("Salto");
        end.setBairro("Dist.Indus.");
        end.setUf("SP");
        end.setCep(13329600L);
        cadEmpresa.setEndereco(end);
        
        Pedido p = new Pedido();
        p.setCcf(25);
        p.setCoo(972);
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
        
        String conteudo = CupomService.gerarCupom(p);
        
        File dir = new File
        ("C:\\Users\\dilaz\\Documents\\NetBeansProjects\\Exercicios_MJV\\src\\main\\java\\exercicio_aula01\\cupom");
        try {
            //PrinterApp.print(conteudo, dir, "cupom.txt");
            PrinterApp.imprimir(conteudo, dir, "cupom.txt");
//         CupomService.gerarPedido(dir, "cupom.txt");
//            CupomService.gerarCupom(p);
//            System.out.println(CupomService.gerarCupom(p));
        } catch (Exception e) {
            e.printStackTrace();
        }
//imprimirPedido(p);
//        PrinterApp.imprimirPedido(p);
//        String conteudo = PrinterApp.imprimirPedido(p);
//        File arq = new File
//        ("C:\\Users\\dilaz\\Documents\\NetBeansProjects\\Exercicios_MJV\\src\\main\\java\\exercicio_aula01\\cupom");
//        if (!arq.exists()) {
//            arq.mkdirs();
//        }
//        File cupom = new File(arq, "cupom.txt");
//        System.out.println("Pedido Cliente " + p.getComprador().getNome());
//        for (PedidoItem i : p.getItens()) {
//            System.out.println(i.getProduto().getTitulo() + " " + i.getValorVenda() + " " + i.getValorTotal());
//        }
    }
}
