package exercicio_aula01.service;

import exercicio_aula01.cadastros.Empresa;
import exercicio_aula01.cadastros.Endereco;
import exercicio_aula01.pedidos.Pedido;
import exercicio_aula01.pedidos.PedidoItem;
import exercicio_aula01.utils.FormatUtil;
import exercicio_aula01.utils.ReaderApp;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dilaz
 */
public class CupomService {
    
    public static List<Pedido> gerarPedido(File dir, String nomeArquivo) throws Exception{
        SimpleDateFormat formatador = new SimpleDateFormat("yyyyMMdd");
        List<String> linhas = ReaderApp.read(dir, nomeArquivo);
        
        List<Pedido> pedidos = new ArrayList<Pedido>();
        for (String linha : linhas) {
            Pedido p = new Pedido();
            p.setData(formatador.parse(linha.substring(0,8)));
            p.setCcf(Integer.valueOf(linha.substring(8,10)));
            p.setCoo(Integer.valueOf(linha.substring(10,13)));            
            pedidos.add(p);
        }
        return pedidos;
    }

    public static String gerarCupom(Pedido pedido) {
        Empresa empresa = pedido.getEmpresa();
        Endereco end = empresa.getCadastro().getEndereco();

        StringBuilder leitor = new StringBuilder();
        leitor.append("------------------------------------------------------------------\n");
        leitor.append(empresa.getCadastro().getNome() + "\n");
        leitor.append(String.format("%s, %s, %s-%s-%s CEP:%s\n", end.getLogradouro(), end.getNumero(),
                end.getBairro(), end.getCidade(), end.getUf(), FormatUtil.formaraCEP(end.getCep().toString())));
//                + empresa.getCadastro().getEndereco() + "\n");
        leitor.append(String.format("CNPJ: %s\n", FormatUtil.formataCNPJ(empresa.getCadastro().getCpfCnpj())));
        leitor.append(String.format("IE: %s\nIM: %s\n", FormatUtil.formataIE(empresa.getIE().toString()),
                FormatUtil.formataIM(empresa.getIM().toString())));
        leitor.append("------------------------------------------------------------------\n");
        SimpleDateFormat dtFormatada = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        String dtHrFormat = dtFormatada.format(pedido.getData());
        leitor.append(String.format("%-42s CCF:%06d: CCO:%06d", dtHrFormat, pedido.getCcf(), pedido.getCoo()));
        leitor.append("\n------------------------------------------------------------------\n");

        List<PedidoItem> item = pedido.getItens();
        leitor.append(String.format("%-35s%10s%10s%10s\n", "ITEM", "QTD", "R$ UNIT", "R$ TOTAL"));
        for (PedidoItem i : item) {
            String q = String.format("%.0f", i.getQuantidade());
            String vd = String.format("%.2f", i.getValorVenda());
            String vt = String.format("%.2f", i.getValorTotal());
            leitor.append(String.format("%-35s%10s%10s%10s\n", i.getProduto().getTitulo(), q, vd, vt));
        }
        leitor.append("\n------------------------------------------------------------------\n");
        leitor.append(String.format("VALOR TOTAL: %.2f", pedido.getValorTotal()));
        leitor.append("\n------------------------------------------------------------------\n");

//        System.out.println(leitor.toString());
        return leitor.toString();

    }
}
