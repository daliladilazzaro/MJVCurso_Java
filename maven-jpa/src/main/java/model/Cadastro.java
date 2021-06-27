package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author dilaz
 */
@Entity
@Table(name = "tbl_cadastro")
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 2)
    private String pf_pj;
    @Column(length = 50)
    private String nome;
    @Column(length = 14)
    private String cpf_cnpj;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPf_pj() {
        return pf_pj;
    }

    public void setPf_pj(String pf_pj) {
        this.pf_pj = pf_pj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public Long getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(Long telefone1) {
        this.telefone1 = telefone1;
    }

    public Long getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(Long telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getArea_atuacao() {
        return area_atuacao;
    }

    public void setArea_atuacao(String area_atuacao) {
        this.area_atuacao = area_atuacao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getSite_instagram() {
        return site_instagram;
    }

    public void setSite_instagram(String site_instagram) {
        this.site_instagram = site_instagram;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
