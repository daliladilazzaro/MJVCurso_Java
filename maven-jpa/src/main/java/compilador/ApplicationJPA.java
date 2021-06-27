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

    static CadastroJpaDAO cjpa = new CadastroJpaDAO();

    public static void main(String[] args) {
        Cadastro cadModel = new Cadastro();
//        cadModel.setId(2);
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
//        testeCadastroJPA(cadModel);
//        testeAlterarJPA(cadModel);
//        testeAlterarJPA();
//        testeRemoverJPA();
//        testeBusca();
    }

    private static void testeRemoverJPA() {
        Cadastro cadModel = new Cadastro();
        cadModel.setId(1);
        cjpa.remover(cadModel);
    }

    private static void testeAlterarJPA(Cadastro c) {        
        cjpa.alterar(c);
    }

    private static void testeCadastroJPA(Cadastro c) {
//        EntityManager em = ConexaoJPA.criarConexao();      
        cjpa.incluir(c);
    }

    public static void testeBusca() {
        List<Cadastro> l = cjpa.busca();
        for (int i = 0; i < l.size(); i++) {
            Cadastro cad = l.get(i);
            System.out.println("id: " + cad.getId());
            System.out.println("pf_pj: " + cad.getPf_pj());
            System.out.println("nome: " + cad.getNome());
            System.out.println("Cpf_cnpj: " + FormatadorUtil.FormataCpfCnpj(cad.getCpf_cnpj()));
            System.out.println("telefone1: " + FormatadorUtil.FormataTelefone(cad.getTelefone1().toString()));
            System.out.println("telefone2: " + FormatadorUtil.FormataTelefone(cad.getTelefone2().toString()));
            System.out.println("email: " + cad.getEmail());
            System.out.println("area_atuacao: " + cad.getArea_atuacao());
            System.out.println("cep: " + FormatadorUtil.FormataCEP(cad.getCep()));
            System.out.println("estado: " + cad.getEstado());
            System.out.println("cidade: " + cad.getCidade());
            System.out.println("rua: " + cad.getRua());
            System.out.println("numero: " + cad.getNumero());
            System.out.println("complemento: " + cad.getComplemento());
            System.out.println("bairro: " + cad.getBairro());
            System.out.println("site_instagram: " + cad.getSite_instagram());
            System.out.println("observacao: " + cad.getObservacao());
            System.out.println("---------------------------");
        }
    }
}
