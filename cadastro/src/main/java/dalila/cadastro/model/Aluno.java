package dalila.cadastro.model;

import dalila.cadastro.model.enums.AlunoNivel;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "spring_aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 3)
    private AlunoNivel nivel;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "spring_cadastro", foreignKey = @ForeignKey(name = "fk_aluno_cadastro"))
    private Cadastro cadastro;

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public Integer getId() {
        return id;
    }

    public AlunoNivel getNivel() {
        return nivel;
    }

    public void setNivel(AlunoNivel nivel) {
        this.nivel = nivel;
    }

}
