/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.api.exceptions;

import spring.api.exceptions.BusinessException;

/**
 *
 * @author dilaz
 */
public class EnderecoIncompletoException extends BusinessException {

    public EnderecoIncompletoException(String endereco) {
        super("Endereco %s Incompleto Inválido!", endereco);
    }
}
