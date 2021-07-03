package compilador;

/**
 *
 * @author dilaz
 */
public class Cadastro {

    private String instrumento;
    private String modelo;
    private String marca;
    private String cor;

    public Cadastro(String instrumento, String modelo, String marca, String cor) {
        this.instrumento = instrumento;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    public Cadastro() {
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return instrumento + "\t"+  modelo+ "\t"+ marca+"\t"+cor; 
    }

}
