package dalila.cadastro.service;

import dalila.cadastro.model.Cadastro;
import dalila.cadastro.repository.CadastroDAO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dilaz
 */
public class ClasseLerArquivo {

    public void ler(String caminhoArquivo) throws FileNotFoundException {

        FileReader fr = new FileReader(new File(caminhoArquivo));

    }
}
