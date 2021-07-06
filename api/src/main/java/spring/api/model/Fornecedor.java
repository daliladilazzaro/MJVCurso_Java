package spring.api.model;

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
@Table(name = "cad_fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//autoincrement
    private Integer id;
    @Column(length = 50, nullable = false)
    private String empresa;
    @Column(length = 50, nullable = false)
    private String logradouro;
    @Column(name = "nome_bairro", length = 40, nullable = false)
    private String bairro;
    @Column(length = 20, nullable = false)
    private String numero;
    @Column(length = 2, nullable = false)
    private String estado;
    @Column(length = 30, nullable = false)
    private String cidade;
    @Column(length = 8, nullable = false)
    private String cep;
    @Column(length = 14, nullable = false)
    private Long cnpj;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getId() {
        return id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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
}
