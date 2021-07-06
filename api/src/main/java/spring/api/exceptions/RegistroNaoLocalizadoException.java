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
public class RegistroNaoLocalizadoException extends BusinessException {

    public RegistroNaoLocalizadoException(String entidade, Object id) {
        super("%s não localizado pelo Id %s ", entidade, id.toString());
    }
}
