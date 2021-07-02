package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author dilaz
 */
//cadastro de instrumentos musicais
@Entity
@Table(name = "cad_instrumento")
public class Instrumento {
    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "marca_instrumento", length = 20)
    private String marca;
    @Column(name = "modelo_instrumento", length = 20)
    private String modelo;
}
