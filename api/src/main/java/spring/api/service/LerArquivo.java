package spring.api.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author dilaz
 */
public class LerArquivo {

    public void ler(String caminhoArquivo) throws FileNotFoundException {

        FileReader fr = new FileReader(new File(caminhoArquivo));

    }
}
