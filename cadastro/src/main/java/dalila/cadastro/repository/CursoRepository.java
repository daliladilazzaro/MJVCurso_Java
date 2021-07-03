/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dalila.cadastro.repository;

import dalila.cadastro.model.Curso;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dilaz
 */
public interface CursoRepository extends CrudRepository<Curso, Integer> {

    List<Curso> findByNomeContaining(String nome);
}
