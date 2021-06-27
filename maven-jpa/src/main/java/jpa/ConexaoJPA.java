package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author dilaz
 */
public class ConexaoJPA {

    public static EntityManager criarConexao() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_AULA");
        return factory.createEntityManager();
    }

}
