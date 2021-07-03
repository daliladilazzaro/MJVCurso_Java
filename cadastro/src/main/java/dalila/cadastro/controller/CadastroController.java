
package dalila.cadastro.controller;

import dalila.cadastro.model.Cadastro;
import dalila.cadastro.repository.CadastroDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dilaz
 */
@RestController
public class CadastroController {
    @Autowired
    private CadastroDAO cadDAO;
    
    @GetMapping(value = "/")
    public List<Cadastro> listCad(){
        return cadDAO.listAll();
    }
}
