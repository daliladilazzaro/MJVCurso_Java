package exercicio_aula01.main;

import exercicio_aula01.cadastros.Empresa;
import exercicio_aula01.cadastros.Endereco;
import exercicio_aula01.pedidos.Pedido;
import exercicio_aula01.pedidos.PedidoItem;
import exercicio_aula01.utils.FormatUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author dilaz
 */
public class PrinterApp {

    public static void imprimirPedido(Pedido pedido) throws ParseException {
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

        System.out.println(leitor.toString());

    }
}
//        MaskFormatter mask = new MaskFormatter("###.###.###/####-##");
//        mask.setValueContainsLiteralCharacters(false);
//        mask.setMask(empresa.getCadastro().getCpfCnpj());

////        leitor.append(String.format("CNPJ: %s\n", empresa.getCadastro().getCpfCnpj()));
//        MaskFormatter maskIE = new MaskFormatter("###.###.###");
//        maskIE.setValueContainsLiteralCharacters(false);
//        MaskFormatter maskIM = new MaskFormatter("##.###.###");
//        maskIM.setValueContainsLiteralCharacters(false);
//        leitor.append(String.format("IE: %s\nIM: %s\n", maskIE.valueToString(empresa.getIE()),
//                maskIM.valueToString(empresa.getIM())));
