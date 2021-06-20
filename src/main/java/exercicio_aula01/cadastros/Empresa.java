package exercicio_aula01.cadastros;

import exercicio_aula01.cadastros.Cadastro;

/**
 *
 * @author dilaz
 */
public class Empresa {
    private Cadastro cadastro;
	private Long impEstadual;
	private Long impMunicipal;

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public Empresa(Long impEstadual, Long impMunicipal) {
        this.impEstadual = impEstadual;
        this.impMunicipal = impMunicipal;
    }

    public Long getImpMunicipal() {
        return impMunicipal;
    }

    public Long getImpEstadual() {
        return impEstadual;
    }
	
        
}
