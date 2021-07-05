package spring.api.model;

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
import spring.api.model.enums.InstrumentoTipo;

/**
 *
 * @author dilaz
 */
@Entity
@Table(name = "cad_instrumento")
public class Instrumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//autoincrement
    private Integer id;
    @Enumerated(EnumType.STRING)
    private InstrumentoTipo tipo;
    @Column(length = 30)
    private String marca;
    @Column(length = 30)
    private String modelo;
    @Column(length = 10)
    private String cor;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cad_fornecedor", foreignKey = @ForeignKey(name = "fk_instrumento_fornecedor"))
    private Fornecedor fornecedor;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getId() {
        return id;
    }

    public InstrumentoTipo getTipo() {
        return tipo;
    }

    public void setTipo(InstrumentoTipo tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
