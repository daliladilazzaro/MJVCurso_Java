package dalila.cadastro.repository;

import dalila.cadastro.model.Cadastro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dilaz
 */
@Repository
public class CadastroDAO {
//    @Autowired //pra nao precisar por o persistene..

    @PersistenceContext
    private EntityManager em;

//    public CadastroDAO() {
////    em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//    }
    @Transactional
    public void save(Cadastro cadastro) {
        em.persist(cadastro);
    }

    public Cadastro buscar(int id) {
        return em.find(Cadastro.class, id);
    }

    public List<Cadastro> listAll() {
        Query quer=em.createQuery("SELECT e FROM CADASTRO e");
        return quer.getResultList();
    }
}
