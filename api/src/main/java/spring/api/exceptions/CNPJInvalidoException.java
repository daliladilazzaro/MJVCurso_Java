package spring.api.exceptions;

/**
 *
 * @author dilaz
 */
public class CNPJInvalidoException extends BusinessException {

    public CNPJInvalidoException(String cnpj) {
        super("%s é obrigatorio ou inválido ", cnpj);
    }

}
