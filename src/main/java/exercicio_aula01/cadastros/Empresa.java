package exercicio_aula01.cadastros;

import exercicio_aula01.cadastros.Cadastro;

/**
 *
 * @author dilaz
 */
public class Empresa {
    private Cadastro cadastro;
	private String impEstadual;
	private String impMunicipal;

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public Empresa(String impEstadual, String impMunicipal) {
        this.impEstadual = impEstadual;
        this.impMunicipal = impMunicipal;
    }

    public String getImpMunicipal() {
        return impMunicipal;
    }

    public String getImpEstadual() {
        return impEstadual;
    }
	
        
}
