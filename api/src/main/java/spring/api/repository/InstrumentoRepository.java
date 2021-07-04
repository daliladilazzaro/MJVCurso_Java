
package spring.api.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import spring.api.model.Instrumento;

/**
 *
 * @author dilaz
 */
public interface InstrumentoRepository extends CrudRepository<Instrumento, Integer>{
    List <Instrumento> findByTipoContaining(String tipo);
}
