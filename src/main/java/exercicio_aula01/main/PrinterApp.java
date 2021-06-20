package exercicio_aula01.main;

import exercicio_aula01.cadastros.Empresa;
import exercicio_aula01.pedidos.Pedido;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author dilaz
 */
public class PrinterApp {

    public static void imprimirPedido(Pedido pedido) throws ParseException {
        Empresa empresa = pedido.getEmpresa();

        StringBuilder leitor = new StringBuilder();
        leitor.append("------------------------------------------------------------------\n");
        leitor.append(empresa.getCadastro().getNome() + "\n"
                + empresa.getCadastro().getEndereco() + "\n");
        MaskFormatter mask = new MaskFormatter("###.###.###/####-##");
        mask.setMask(empresa.getCadastro().getCpfCnpj());
        leitor.append(String.format("CNPJ: %s\n", empresa.getCadastro().getCpfCnpj()));
//        leitor.append(String.format("CNPJ: %s\n", empresa.getCadastro().getCpfCnpj()));
        leitor.append(String.format("IE: %d\nIM: %d\n", empresa.getImpEstadual(), empresa.getImpMunicipal()));
        leitor.append("------------------------------------------------------------------\n");
        SimpleDateFormat dtFormatada = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        String dtHrFormat = dtFormatada.format(pedido.getData());
        leitor.append(dtHrFormat);
        leitor.append("\n------------------------------------------------------------------\n");
        leitor.append(String.format("VALOR TOTAL: %.2f", pedido.getValorTotal()));
        leitor.append("\n------------------------------------------------------------------\n");
        System.out.println(leitor.toString());

    }
}
