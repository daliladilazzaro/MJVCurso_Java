package spring.api.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.exceptions.CampoObrigatorioException;
import spring.api.exceptions.RegistroNaoLocalizadoException;
import spring.api.model.Fornecedor;
import spring.api.repository.FornecedorRepository;

/**
 *
 * @author dilaz
 */
@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository repository;

    public void incluir(Fornecedor fornecedor) {
        if (fornecedor.getCnpj() == null) {
            throw new CampoObrigatorioException("CNPJ");
        }
        if (fornecedor.getBairro() == null) {
            throw new CampoObrigatorioException("bairro");
        }
        if (fornecedor.getCep() == null) {
            throw new CampoObrigatorioException("cep");
        }
        if (fornecedor.getCidade() == null) {
            throw new CampoObrigatorioException("cidade");
        }
        if (fornecedor.getEmpresa() == null) {
            throw new CampoObrigatorioException("empresa");
        }
        if (fornecedor.getEstado() == null) {
            throw new CampoObrigatorioException("estado");
        }
        if (fornecedor.getLogradouro() == null) {
            throw new CampoObrigatorioException("logradouro");
        }
        if (fornecedor.getNumero() == null) {
            throw new CampoObrigatorioException("numero");
        }
        repository.save(fornecedor);
    }

    public void alterar(Fornecedor fornecedor) {
        repository.save(fornecedor);
    }
    public void delete(Integer id) {
        if (id== null) {
            throw new CampoObrigatorioException("id");
        }
        repository.deleteById(id);
    }

    public Fornecedor buscar(Integer id) throws RegistroNaoLocalizadoException {
        Optional<Fornecedor> opt = repository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new RegistroNaoLocalizadoException("Fornecedor", id);
        }

    }
}
