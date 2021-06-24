package exercicio_aula01.cadastros;
/**
 *
 * @author dilaz
 */
public class Instrumento extends Produto{
    
    private String marca;  
    private Cadastro tipoInstrumento;

   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Cadastro getTipoInstrumento() {
        return tipoInstrumento;
    }

    public void setTipoInstrumento(Cadastro tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }
    
    
}
