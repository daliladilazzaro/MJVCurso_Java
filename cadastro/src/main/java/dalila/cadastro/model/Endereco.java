package dalila.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author dilaz
 */
@Entity
@Table(name = "cdspring_endereco")
public class Endereco {
    @Id
    private int id;
    private String logradouro;
    private String numero;
    
    @ManyToOne
    @JoinColumn(name = "cd_logradouro")
    private Logradouro logradouro2;
    
}
