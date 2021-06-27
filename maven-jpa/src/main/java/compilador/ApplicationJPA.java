package compilador;

import dao.CadastroJpaDAO;
import java.util.List;
import javax.persistence.EntityManager;
import jpa.ConexaoJPA;
import model.Cadastro;
import utils.FormatadorUtil;

/**
 *
 * @author dilaz
 */
public class ApplicationJPA {

    static CadastroJpaDAO cadDAO = new CadastroJpaDAO();

    public static void main(String[] args) {
        testeCadastroJPA();
    }

    private static void testeCadastroJPA() {
//        EntityManager em = ConexaoJPA.criarConexao();
        CadastroJpaDAO cjpa = new CadastroJpaDAO();
        Cadastro cadModel = new Cadastro();

        cadModel.setPf_pj("F");
        cadModel.setNome("Dalila Di Lazzaro");
        cadModel.setCpf_cnpj("25478697530");
        cadModel.setTelefone1(12756987423L);
        cadModel.setTelefone2(12996987423L);
        cadModel.setEmail("dalila@dalila.com");
        cadModel.setArea_atuacao("Dev e Adm");
        cadModel.setCep("45697521");
        cadModel.setEstado("SP");
        cadModel.setCidade("São Paulo");
        cadModel.setRua("Av Brasil");
        cadModel.setNumero("479");
        cadModel.setComplemento("APTO1 BL2");
        cadModel.setBairro("Jardins");
        cadModel.setSite_instagram("@dilazzaro");
        cadModel.setObservacao("Gosto de tocar violao.");
        cadModel.setNome("Jos Maia");
        cjpa.incluir(cadModel);
    }

}
