package dalila.cadastro.model;

import dalila.cadastro.model.enums.AlunoNivel;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Integer cargaHoraria;
    @Enumerated(EnumType.STRING)
    private AlunoNivel nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public AlunoNivel getNivel() {
        return nivel;
    }

    public void setNivel(AlunoNivel nivel) {
        this.nivel = nivel;
    }

    public Integer getId() {
        return id;
    }
//    @Id
//    private int id;
//    
//    @OneToMany
//    private List<Professor> prof;

}
