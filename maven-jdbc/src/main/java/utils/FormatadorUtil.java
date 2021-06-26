package utils;

/**
 *
 * @author dilaz
 */
public class FormatadorUtil {
    public static String FormataCEP(String cep){
        String cepFormat = cep.replaceAll("(\\d{2})(\\d{3})(\\d{3})", "$1.$2-$3");
        return cepFormat;
    }
    public static String FormataCpfCnpj(String c){     
        //valida o tamanho para retrnar CPF ou CNPJ
        if (c.length()==14) { 
            return FormataCnpj(c);
        }else if(c.length()==11){
            return FormataCpf(c);
        }
        return null;
    }
    public static String FormataCpf(String c){        
        String cFormat = c.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        return cFormat;
    }
    public static String FormataCnpj(String c){        
        String cFormat = c.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
        return cFormat;
    }
    public static String FormataTelefone(String t){        
        String tFormat = t.replaceAll("(\\d{2})(\\d{5})(\\d{4})", "($1)$2-$3");
        return tFormat;
    }
}
