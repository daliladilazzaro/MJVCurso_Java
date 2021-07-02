package dalila.cadastro.model;

import dalila.cadastro.model.enums.GrauParentesco;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author dilaz
 */
@Embeddable //ele imbute atributos campos na mesma tabela
public class ContatoEmergencia {

    @Column(name = "ce_nome", length = 30)
    private String nome;
    @Column(name = "ce_email", length = 70)
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(name = "ce_parentesco", length = 10)
    private GrauParentesco parentesco;
    @Column(name = "ce_telefone", length = 20)
    private Long telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GrauParentesco getParentesco() {
        return parentesco;
    }

    public void setParentesco(GrauParentesco parentesco) {
        this.parentesco = parentesco;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
}
