package exercicio_aula01.cadastros;

import exercicio_aula01.cadastros.Cadastro;

/**
 *
 * @author dilaz
 */
public class Empresa {
    private Cadastro cadastro;
	private Long IE;
	private Long IM;

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public Empresa(Long IE, Long IM) {
        this.IE = IE;
        this.IM = IM;
    }

    public Long getIM() {
        return IM;
    }

    public Long getIE() {
        return IE;
    }
	
        
}
