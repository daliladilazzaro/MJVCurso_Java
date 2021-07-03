
package dalila.cadastro.controller;

import dalila.cadastro.model.Curso;
import dalila.cadastro.repository.CursoRepository;
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

/**
 *
 * @author dilaz
 */
@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoRepository repos;
    
    @GetMapping
    public Iterable<Curso> list(){
        return repos.findAll();
    }
    
    @PostMapping()
    public void incluir(@RequestBody Curso c){
        repos.save(c);
    }
    
    @PutMapping
    public void alterar(@RequestBody Curso c){
        repos.save(c);
    }
    
    @GetMapping(value = "/filter/{nome}")
    public Iterable<Curso> list(@PathVariable("nome")String nome){
        return repos.findByNomeContaining(nome);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        repos.deleteById(id);
    }
    @DeleteMapping()
    public void deleteByParam(@RequestParam("id") Integer id, @RequestParam("nome") String nome){
        repos.deleteById(id);
    }
    @GetMapping(value="/{id}")
    public Curso buscar(@PathVariable("id") Integer id){
        return repos.findById(id).orElse(null);
    }
}
