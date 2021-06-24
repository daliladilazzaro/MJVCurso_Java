package exercicio_aula01.utils;

/**
 *
 * @author dilaz
 */
public class FormatUtil {

    public static String formaraCEP(String end){
        String endFormatado = end.replaceAll("(\\d{2})(\\d{3})(\\d{3})", "$1.$2-$3");
        return endFormatado;        
    }
    
    public static String formataIE(String ie) {
        String ieFormatado = ie.replaceAll("(\\d{3})(\\d{3})(\\d{3})", "$1.$2.$3");
        return ieFormatado;
    }

    public static String formataIM(String im) {
        String imFormatado = im.replaceAll("(\\d{2})(\\d{3})(\\d{3})", "$1.$2.$3");
        return imFormatado;
    }

    public static String formataCNPJ(String cnpj) {
        String cnpjFormatado = cnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
        return cnpjFormatado;
    }

    public static String formataCPF(String cpf) {
        String cpfFormatado = cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        return cpfFormatado;
    }

    public static String validaCnpjCpf(String validador) {
        if (validador == null) {
            System.err.println("Atenção!\nO campo deverá ser preenchido!");
            return "CAMPO-VÁZIO";
        }
        if (!ValidatorUtil.isCpfCnpf(validador)) {
            System.err.println("Atenção!\nPreenchimento inválido!");
            return "CAMPO-INVÁLIDO";
        }
        if (validador.length() == ValidatorUtil.MAX_CPF) {
            return formataCPF(validador);
        } else {
            return formataCNPJ(validador);
        }
    }
}
