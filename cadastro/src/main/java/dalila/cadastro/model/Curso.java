
package dalila.cadastro.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dilaz
 */
@Entity
@Table(name = "cdspring_curso")
public class Curso {
    @Id
    private int id;
    
    @OneToMany
    private List<Professor> prof;
    
}
