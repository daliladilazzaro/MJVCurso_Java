package dalila.cadastro.repository;

import dalila.cadastro.model.Aluno;
import dalila.cadastro.model.Cadastro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dilaz
 */
//@Repository
public interface AlunoDAO extends JpaRepository<Aluno, Integer> {

//    @PersistenceContext
//    private EntityManager em;
//
//    @Transactional
//    public void save(Aluno a) {
//        em.persist(a);
//    }
////       public Aluno buscar(int id) {
////        return em.find(Aluno.class, id);
////    }
//
//    public List<Aluno> listAll() {
//        Query quer=em.createQuery("SELECT e FROM Aluno e");
//        return quer.getResultList();
//    }
}
