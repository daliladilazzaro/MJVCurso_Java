package spring.api.service;

import java.util.Optional;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import spring.api.exceptions.BusinessException;
import spring.api.exceptions.CNPJInvalidoException;
import spring.api.exceptions.CampoObrigatorioException;
import spring.api.exceptions.RegistroNaoLocalizadoException;
import spring.api.exceptions.RelacionamentoException;
import spring.api.model.Fornecedor;
import spring.api.model.Instrumento;
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
       this.validate(fornecedor);
        repository.save(fornecedor);
    }

    public void alterar(Fornecedor fornecedor) {
        validate(fornecedor);
        repository.save(fornecedor);
    }
    
    private void validate(Fornecedor fornecedor){
         if (fornecedor.getCnpj() == null) {
            throw new CNPJInvalidoException("CNPJ");
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
    }
    public void delete(Integer id) {
        try {
        if (id== null) {
            throw new CampoObrigatorioException("id");
        }
            
        repository.deleteById(id);
        } catch ( DataIntegrityViolationException e) {
//            e.printStackTrace();
            throw new RelacionamentoException(id);
        } 
    }
    public void deleteByParam(Integer id) {
        try {
        if (id== null) {
            throw new CampoObrigatorioException("id");
        }
            
        repository.deleteById(id);
        } catch ( DataIntegrityViolationException e) {
            throw new RelacionamentoException(id);
        } 
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
