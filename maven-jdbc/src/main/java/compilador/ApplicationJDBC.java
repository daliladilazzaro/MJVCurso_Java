package compilador;

import dao.CadastroDAO;
import java.util.List;
import model.CadastroModel;
import utils.FormatadorUtil;

/**
 *
 * @author dilaz
 */
public class ApplicationJDBC {

    static CadastroDAO cadDAO = new CadastroDAO();

    public static void main(String[] args) {
        CadastroModel cadModel = new CadastroModel();
//        cadModel.setPf_pj("F");
//        cadModel.setNome("Dalila Di Lazzaro");
//        cadModel.setCpf_cnpj("25478697530");
//        cadModel.setTelefone1(12756987423L);
//        cadModel.setTelefone2(12996987423L);
//        cadModel.setEmail("dalila@dalila.com");
//        cadModel.setArea_atuacao("Dev e Adm");
//        cadModel.setCep("45697521");
//        cadModel.setEstado("SP");
//        cadModel.setCidade("São Paulo");
//        cadModel.setRua("Av Brasil");
//        cadModel.setNumero("479");
//        cadModel.setComplemento("APTO1 BL2");
//        cadModel.setBairro("Jardins");
//        cadModel.setSite_instagram("@dilazzaro");
//        cadModel.setObservacao("Gosto de tocar violao.");
//        cadModel.setNome("Jos Maia");
//        cadModel.setTelefone(66987466245L);
//        testeAlterar("Claudia", cadModel);
//        testeIncluir(cadModel);
////        teste excluir
//        cadModel.setId(5);
//        testeExcluir(cadModel);
        testeBuscarLista();
//        testeBuscaID(cadModel);

    }

    private static void testeBuscaID(CadastroModel cadModel) {
        StringBuilder ler = new StringBuilder();
        Integer id = cadModel.getId();
        cadModel.setId(id);
        CadastroModel cad = cadDAO.buscarID(id);
        ler.append(String.format("%5d %5s %5s %5s %5d %5d %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s",
                cad.getId(), cad.getPf_pj(), cad.getNome(), FormatadorUtil.FormataCpfCnpj(cad.getCpf_cnpj()),
                FormatadorUtil.FormataTelefone(cad.getTelefone1().toString()),
                FormatadorUtil.FormataTelefone(cad.getTelefone2().toString()),
                cad.getEmail(), cad.getArea_atuacao(), FormatadorUtil.FormataCEP(cad.getCep()), cad.getEstado(),
                cad.getCidade(), cad.getRua(), cad.getNumero(), cad.getComplemento(), cad.getBairro(),
                cad.getSite_instagram(), cad.getObservacao()));
        ler.append("\n\t\t------------------------------------------------------------------------------\n");
        System.out.println(ler.toString());

    }
//      buscar a lista funciona

    private static void testeBuscarLista() {
        StringBuilder ler = new StringBuilder();
        List<CadastroModel> buscarLista = cadDAO.listar();
        for (int i = 0; i < buscarLista.size(); i++) {
            CadastroModel cad = buscarLista.get(i);

//        System.out.println("id: " + cad.getId() + "\t" + "pf_pj: " + cad.getPf_pj() + "\t" + "nome: " + cad.getNome() + "\t"
//                    + "Cpf_cnpj: " + cad.getCpf_cnpj() + "\t" + "telefone1: " + cad.getTelefone1() + "\t"
//                    + "telefone2: " + cad.getTelefone2() + "\t" + "email: " + cad.getEmail() + "\t"
//                    + "area_atuacao: " + cad.getArea_atuacao() + "\t" + "cep: " + cad.getCep() + "\t" + "estado: " + cad.getEstado() + "\t"
//                    + "cidade: " + cad.getCidade() + "\t" + "rua: " + cad.getRua() + "\t" + "numero: " + cad.getNumero() + "\t"
//                    + "complemento: " + cad.getComplemento() + "\t" + "bairro: " + cad.getBairro() + "\t"
//                    + "site_instagram: " + cad.getSite_instagram() + "\t" + "observacao: " + cad.getObservacao());
//            ler.append(String.format("%5d %5s %5s %5s %5d %5d %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s",
//                    cad.getId(), cad.getPf_pj(), cad.getNome(), cad.getCpf_cnpj(), cad.getTelefone1(), cad.getTelefone2(),
//                    cad.getEmail(), cad.getArea_atuacao(), cad.getCep(), cad.getEstado(), cad.getCidade(), cad.getRua(),
//                    cad.getNumero(), cad.getComplemento(), cad.getBairro(), cad.getSite_instagram(), cad.getObservacao()));
//            ler.append("\n\t------------------------------------------------------------------------------\n");
            System.out.println(ler.toString());
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
            System.out.println("--------------");
        }
    }

    //excluir funciona
    private static void testeExcluir(CadastroModel cadModel) {
        Integer id = cadModel.getId();
        if (id != null) {
            cadModel.setId(id);
            cadDAO.excluir(id);
        } else {
            System.out.println("Falta incluir o ID");
        }
    }

    //alterar funciona 
    private static void testeAlterar(String nomeAntigo, CadastroModel cadModel) {
        Integer id = cadDAO.buscarNome(nomeAntigo);
        if (id != null) {
            cadModel.setId(id);
            cadDAO.alterar(cadModel);
        }
    }

//  incluir funciona
    private static void testeIncluir(CadastroModel cadModel) {
        boolean verifica = cadDAO.verificaNome(cadModel.getNome());
//        CadastroModel cad = cadDAO.buscarNome(cadModel.getNome());
//        CadastroModel cadModel = cadDAO.buscarNome("Sete");
//        CadastroModel cadModel = cadDAO.buscarID(1);
        if (verifica) {
//            cadModel = new CadastroModel();
//            cadModel.setNome("Sete");
//            cadModel.setTelefone(66987466245L);
//        cadDAO.incluir("Clemilda", 14523697541L);
            System.out.println("Cadastro já existe com este nome");
        } else {
            cadDAO.incluir(cadModel);
        }

    }
}
