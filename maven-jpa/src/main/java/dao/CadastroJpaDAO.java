package dao;

import javax.persistence.EntityManager;
import jpa.ConexaoJPA;
import model.Cadastro;

/**
 *
 * @author dilaz
 */
public class CadastroJpaDAO {

    private EntityManager em;

    public CadastroJpaDAO() {
        em = ConexaoJPA.criarConexao();
    }

    public void incluir(Cadastro c) {
        em.getTransaction().begin();
        em.persist(c);
//        em.merge(c);//ele altera
        em.getTransaction().commit();
    }
}
