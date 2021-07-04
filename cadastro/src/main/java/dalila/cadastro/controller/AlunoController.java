
package dalila.cadastro.controller;

import dalila.cadastro.model.Aluno;
import dalila.cadastro.model.Cadastro;
import dalila.cadastro.repository.AlunoDAO;
import dalila.cadastro.repository.CadastroDAO;
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
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoDAO repos;
    
    @GetMapping
    public Iterable<Aluno> list(){
        return repos.findAll();
    }
    
    @PostMapping()
    public void incluir(@RequestBody Aluno a){
        repos.save(a);
    }
    
    @PutMapping
    public void alterar(@RequestBody Aluno a){
        repos.save(a);
    }
    
    @GetMapping(value = "/filter/{id}")
    public Iterable<Aluno> list(@PathVariable("id")Integer id){
        return repos.findAll();
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        repos.deleteById(id);
    }
    @DeleteMapping()
    public void deleteByParam(@RequestParam("id") Integer id, @RequestParam("nivel") String nivel){
        repos.deleteById(id);
    }
    @GetMapping(value="/{id}")
    public Aluno buscar(@PathVariable("id") Integer id){
        return repos.findById(id).orElse(null);
    }
}
