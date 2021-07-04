/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.api.model.enums;

/**
 *
 * @author dilaz
 */
public enum InstrumentoTipo {
    GUI("Guitarra"),
    VIO("Violão"),
    VIL("Violino"),
    UKU("Ukulele"),
    BAI("Baixo"),
    BAT("Bateria");

    private String descricao;

    private InstrumentoTipo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
