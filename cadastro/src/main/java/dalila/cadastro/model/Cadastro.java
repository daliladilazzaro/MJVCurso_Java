package dalila.cadastro.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cdspring_cadastro")
public class Cadastro {
	@Id
	private Integer id;
        @OneToOne
        @JoinColumn(name="cdspring_endereco")
        private Endereco endereco;
        
        @OneToMany
        @JoinColumn(name ="cdspring_cadastro")
        private List<Telefone> tel;
        
	@Column(length = 2)
	private String pf_pj;
	@Column(length = 50)
	private String nome;
	@Column(length = 14)
	private String cpf_cnpj;
//	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "char(1)")
	private Sexo sexo;
//	@Temporal(TemporalType.DATE)
	private LocalDate data_nasc;
	@Column(name="dh_cadastro", nullable = false)
	private LocalDateTime datahora_cadastro;
	@Column(length = 11)
	private Long telefone1;
	@Column(length = 11)
	private Long telefone2;
	@Column(length = 50)
	private String email;
	@Column(length = 50)
	private String area_atuacao;
	@Column(length = 8)
	private String cep;
	@Column(length = 2)
	private String estado;
	@Column(length = 20)
	private String cidade;
	@Column(length = 40)
	private String rua;
	@Column(length = 6)
	private String numero;
	@Column(length = 10)
	private String complemento;
	@Column(length = 15)
	private String bairro;
	@Column(length = 50)
	private String site_instagram;
	@Column(length = 255)
	private String observacao;
}
