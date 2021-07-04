package spring.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
