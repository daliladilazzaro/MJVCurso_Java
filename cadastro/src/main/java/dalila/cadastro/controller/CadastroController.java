package dalila.cadastro.controller;

import dalila.cadastro.exceptions.RegistroNaoLocalizadoException;
import dalila.cadastro.model.Cadastro;
import dalila.cadastro.service.CadastroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dilaz
 */
@RestController
@RequestMapping("/cadastros")
public class CadastroController {

    @Autowired
    private CadastroService service;

    @PostMapping()
    public void incluir(@RequestBody Cadastro cadastro) {
        service.incluir(cadastro);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity find(@PathVariable("id") Integer id) {
        try {
            Cadastro cadastro = service.buscar(id);
            return new ResponseEntity(cadastro, HttpStatus.OK);
        } catch (RegistroNaoLocalizadoException e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    @GetMapping(value = "handler/{id}")
    public Cadastro handlerFind(@PathVariable("id") Integer id) {
        Cadastro cadastro = service.buscar(id);
        return cadastro;
    }
//    @Autowired
//    private CadastroDAO cadDAO;
//    
//    @GetMapping(value = "/")
//    public List<Cadastro> listCad(){
//        return cadDAO.listAll();
//    }
}
