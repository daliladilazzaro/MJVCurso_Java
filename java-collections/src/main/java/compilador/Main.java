
package compilador;

import dao.InstrumentoListDAO;
import java.util.List;
import model.Instrumento;

/**
 *
 * @author dilaz
 */
public class Main {
    static InstrumentoListDAO list = new InstrumentoListDAO();
    public static void main(String[] args) {
        buscaList();
    }
    
    public static void buscaList() {
        List<Instrumento> lista = list.busca();
        for (int i = 0; i < lista.size(); i++) {
            Instrumento inst = lista.get(i);
            System.out.println("id: " + inst.getId());
            System.out.println("pf_pj: " + inst.getMarca());
            System.out.println("nome: " + inst.getModelo());
            System.out.println("---------------------------");
        }
    }
    
}
