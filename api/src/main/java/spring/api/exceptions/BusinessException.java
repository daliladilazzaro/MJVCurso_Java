package spring.api.exceptions;

/**
 *
 * @author dilaz
 */

public class BusinessException extends RuntimeException {

    public BusinessException(String msg) {
        super(msg);
    }

    public BusinessException(String msg, Object... params) {
        super(String.format(msg, params));
    }

    public static void main(String[] args) {
        Integer id = 123;
        String entidade = "Movel";
        BusinessException bu = new BusinessException("%s não localizado pelo Id %s ", entidade, id.toString());
        System.out.println(bu.getMessage());

        BusinessException rnle = new RegistroNaoLocalizadoException(entidade, id.toString());

        System.out.println(rnle.getMessage());
    }
}
