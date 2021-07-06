package dalila.cadastro.service;

import dalila.cadastro.exceptions.CampoObrigatorioException;
import dalila.cadastro.exceptions.RegistroNaoLocalizadoException;
import dalila.cadastro.model.Cadastro;
import dalila.cadastro.repository.CadastroDAO;
import dalila.cadastro.repository.CadastroRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dilaz
 */
@Service
public class CadastroService {

    @Autowired
    private CadastroRepository repository;

    public void incluir(Cadastro cadastro) {
        if (cadastro.getCpf() == null) {
            throw new CampoObrigatorioException("CPF");
        }

        repository.save(cadastro);

    }

    public Cadastro buscar(Integer id) throws RegistroNaoLocalizadoException {
        Optional<Cadastro> opt = repository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new RegistroNaoLocalizadoException("Cadastro", id);
        }

    }
}
