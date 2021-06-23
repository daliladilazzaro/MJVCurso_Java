package exercicio_aula01.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author dilaz
 */
public class PrinterApp {

    //sobrecarga de metodos
    public static void imprimir(String conteudo, File dir, String nomeArquivo)throws Exception{
        File arq = new File(dir, nomeArquivo);
        imprimir(conteudo, dir, arq);
    }
    public static void imprimir(String conteudo, File dir, File arq) throws Exception {
        if (!dir.exists()) {
            dir.mkdirs();
        }
        Path caminho = new File(dir, arq.getName()).toPath();
        Files.write(caminho, conteudo.getBytes());
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
