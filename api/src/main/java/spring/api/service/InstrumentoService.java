package spring.api.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.exceptions.CNPJInvalidoException;
import spring.api.exceptions.CampoObrigatorioException;
import spring.api.exceptions.RegistroNaoLocalizadoException;
import spring.api.model.Fornecedor;
import spring.api.model.Instrumento;
import spring.api.repository.InstrumentoRepository;

/**
 *
 * @author dilaz
 */
@Service
public class InstrumentoService {

    @Autowired
    private InstrumentoRepository repository;

    public void incluir(Instrumento instrumento) {
        validade(instrumento);
        repository.save(instrumento);
    }

    private void validade(Instrumento instrumento) {
        if (instrumento.getCor() == null) {
            throw new CampoObrigatorioException("cor");
        }
        if (instrumento.getMarca() == null) {
            throw new CampoObrigatorioException("marca");
        }
        if (instrumento.getModelo() == null) {
            throw new CampoObrigatorioException("modelo");
        }
        if (instrumento.getTipo() == null) {
            throw new CampoObrigatorioException("tipo");
        }
        if (instrumento.getValor() == null) {
            throw new CampoObrigatorioException("valor");
        }
        Fornecedor fornecedor=new Fornecedor();
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

    public void alterar(Instrumento instrumento) {
        validade(instrumento);
        repository.save(instrumento);
    }

    public void delete(Integer id) {
        if (id == null) {
            throw new CampoObrigatorioException("id");
        }
        repository.deleteById(id);
    }

    public Instrumento buscar(Integer id) throws RegistroNaoLocalizadoException {
        Optional<Instrumento> opt = repository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new RegistroNaoLocalizadoException("Instrumento", id);
        }

    }
}
