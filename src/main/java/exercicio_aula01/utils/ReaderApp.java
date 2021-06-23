package exercicio_aula01.utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author dilaz
 */
public class ReaderApp {

    public static List<String> read(File dir, String nomeArquivo) throws Exception {
        Path caminho = new File(dir, nomeArquivo).toPath();
        return Files.readAllLines(caminho);
    }
}
