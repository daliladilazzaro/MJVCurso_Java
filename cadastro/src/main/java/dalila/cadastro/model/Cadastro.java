package dalila.cadastro.model;

import dalila.cadastro.model.enums.Sexo;
import java.time.LocalDate;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "spring_cadastro")
public class Cadastro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
        @Column(length = 60, nullable = false)
	private String nome;
        @Column(length = 60, nullable = false)
	private String email;
        @Column(length = 9, nullable = false)
	private String rg;
        @Column(length = 11, nullable = false)
	private String cpf;
        @Column(length = 11, nullable = false)
	private Long telefone;
        
        @Embedded
        private Endereco endereco;
        
	private String nacionalidade;
	private LocalDate dataNascimento;
        
        @Embedded //embutir atributos
        private ContatoEmergencia cont1;
        @Embedded
        @AttributeOverrides( {
        @AttributeOverride(name="nome", column = @Column(name="ce2_nome") ),
        @AttributeOverride(name="email", column = @Column(name="ce2_email") ),
        @AttributeOverride(name="parentesco", column = @Column(name="ce2_parentesco") ),
        @AttributeOverride(name="telefone", column = @Column(name="ce2_telefone") )
	} )
        private ContatoEmergencia cont2;

    public Integer getId() {
        return id;
    }

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ContatoEmergencia getCont1() {
        return cont1;
    }

    public void setCont1(ContatoEmergencia cont1) {
        this.cont1 = cont1;
    }

    public ContatoEmergencia getCont2() {
        return cont2;
    }

    public void setCont2(ContatoEmergencia cont2) {
        this.cont2 = cont2;
    }

	
}
