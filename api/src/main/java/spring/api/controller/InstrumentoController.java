package spring.api.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.api.exceptions.CampoObrigatorioException;
import spring.api.exceptions.RegistroNaoLocalizadoException;
import spring.api.model.Instrumento;
import spring.api.repository.InstrumentoRepository;
import spring.api.service.InstrumentoService;

/**
 *
 * @author dilaz
 */
@RestController
@RequestMapping("/instrumentos")
public class InstrumentoController {

    @Autowired
    private InstrumentoService service;
//    private InstrumentoRepository repository;

    @PostMapping()
    public void incluir(@RequestBody Instrumento instrumento) throws CampoObrigatorioException {
        service.incluir(instrumento);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity find(@PathVariable("id") Integer id) {
        try {
            Instrumento instrumento = service.buscar(id);
            return new ResponseEntity(instrumento, HttpStatus.OK);
        } catch (RegistroNaoLocalizadoException e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    @PutMapping
    public void alterar(@RequestBody Instrumento i) {
        service.alterar(i);
    }
//
//

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws CampoObrigatorioException {
        service.delete(id);
    }

    @GetMapping(value = "handler/{id}")
    public Instrumento handlerFind(@PathVariable("id") Integer id) throws RegistroNaoLocalizadoException {
        Instrumento instrumento = service.buscar(id);
        return instrumento;
    }

//    
//    @GetMapping
//    public Iterable<Instrumento> list(){
//        return repository.findAll();
//    }
//    
//    @PostMapping()
//    public void incluir(@RequestBody Instrumento i){
//        repository.save(i);
//    }
//    
//    @PutMapping
//    public void alterar(@RequestBody Instrumento i){
//        repository.save(i);
//    }
//    
//    @GetMapping(value = "/filter/{tipo}")
//    public Iterable<Instrumento> list(@PathVariable("tipo")String tipo){
//        return repository.findByTipoContaining(tipo);
//    }
//    
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable("id")Integer id){
//        repository.deleteById(id);
//    }
//    @DeleteMapping()
//    public void deleteByParam(@RequestParam("id") Integer id, @RequestParam("tipo") String tipo){
//        repository.deleteById(id);
//    }
//    @GetMapping(value="/{id}")
//    public Instrumento buscar(@PathVariable("id") Integer id){
//        return repository.findById(id).orElse(null);
//    }
}
