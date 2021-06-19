package exercicio_aula01.cadastros;

import exercicio_aula01.cadastros.Cadastro;

/**
 *
 * @author dilaz
 */
public class Empresa {
    private Cadastro cadastro;
	private Long impMunicipal;
	private Long impEstadual;

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public Empresa(Long impMunicipal, Long impEstadual) {
        this.impMunicipal = impMunicipal;
        this.impEstadual = impEstadual;
    }

    public Long getImpMunicipal() {
        return impMunicipal;
    }

    public Long getImpEstadual() {
        return impEstadual;
    }
	
        
}
