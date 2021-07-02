
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import jpa.ConexaoJPA;
import model.Instrumento;

/**
 *
 * @author dilaz
 */
public class InstrumentoListDAO {
    
      private EntityManager em;

    public InstrumentoListDAO() {
        em = ConexaoJPA.criarConexao();
    }
    
     public List<Instrumento> busca(){
        return em.createQuery("FROM "+ Instrumento.class.getName()).getResultList();
    }
}
