
package exercicio_aula01.utils;

/**
 *
 * @author dilaz
 */
public class ValidatorUtil {
    public static final int MAX_CPF=11;
    public static final int MAX_CNPJ=14;
    
    public static boolean isCPF(String cpf){
        return cpf.matches("\\d{11}");
    }
    public static boolean isCNPJ(String cnpj){
        return cnpj.matches("\\d{14}");
    }
    public static boolean isCpfCnpf(String validador){
        return isCNPJ(validador) || isCPF(validador);
    }
}
