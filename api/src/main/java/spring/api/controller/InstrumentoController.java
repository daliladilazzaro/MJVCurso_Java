
package spring.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.api.model.Instrumento;
import spring.api.repository.InstrumentoRepository;

/**
 *
 * @author dilaz
 */
@RestController
@RequestMapping("/instrumentos")
public class InstrumentoController {
    @Autowired
    private InstrumentoRepository repository;
    
    @GetMapping
    public Iterable<Instrumento> list(){
        return repository.findAll();
    }
    
    @PostMapping()
    public void incluir(@RequestBody Instrumento i){
        repository.save(i);
    }
    
    @PutMapping
    public void alterar(@RequestBody Instrumento i){
        repository.save(i);
    }
    
    @GetMapping(value = "/filter/{tipo}")
    public Iterable<Instrumento> list(@PathVariable("tipo")String tipo){
        return repository.findByTipoContaining(tipo);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        repository.deleteById(id);
    }
    @DeleteMapping()
    public void deleteByParam(@RequestParam("id") Integer id, @RequestParam("tipo") String tipo){
        repository.deleteById(id);
    }
    @GetMapping(value="/{id}")
    public Instrumento buscar(@PathVariable("id") Integer id){
        return repository.findById(id).orElse(null);
    }
}
