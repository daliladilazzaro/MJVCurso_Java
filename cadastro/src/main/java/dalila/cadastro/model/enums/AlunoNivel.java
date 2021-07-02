package dalila.cadastro.model.enums;

/**
 *
 * @author dilaz
 */
public enum AlunoNivel {

    IN("INICIANTE"),
    BA("BASICO"),
    IT("INTERMEDIARIO"),
    AV("AVANCADO");

    private String descricao;

    private AlunoNivel(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
