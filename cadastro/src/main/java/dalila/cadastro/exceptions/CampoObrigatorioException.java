
package dalila.cadastro.exceptions;

/**
 *
 * @author dilaz
 */
public class CampoObrigatorioException extends BusinessException {
    public CampoObrigatorioException(String campo) {
        super("O %s é obrigatório", campo);		
    }
}
