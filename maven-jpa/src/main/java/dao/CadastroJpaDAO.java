package dao;

import java.util.List;
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
        em.getTransaction().commit();
    }

    public void alterar(Cadastro c) {
        try {
            em.getTransaction().begin();
            em.merge(c);//ele altera
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    public List<Cadastro> busca(){
        return em.createQuery("FROM "+ Cadastro.class.getName()).getResultList();
    }
    public void remover(Cadastro c) {
        try {
            em.getTransaction().begin();
            c = em.find(Cadastro.class, c.getId());
            em.remove(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    
    public void removerById(final int id){
        try {
            Cadastro c = getById(id);
            remover(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Cadastro getById(final int id){
        return em.find(Cadastro.class, id);
    }
}
