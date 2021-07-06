/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.api.exceptions;

/**
 *
 * @author dilaz
 */
public class RelacionamentoException extends BusinessException {

    public RelacionamentoException(Integer id) {
        super("Id %s está em relacionamento em outra tabela.", id);
    }
}
