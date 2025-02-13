package id.my.hendisantika.helidonrestapiexample.service;

import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Created by IntelliJ IDEA.
 * Project : helidon-rest-api-example
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 13/02/25
 * Time: 07.02
 * To change this template use File | Settings | File Templates.
 */
@RequestScoped
public class PersistenceService {

    private EntityManager manager;

    public EntityManager getEntityManager() {
        if (manager == null) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("application");
            manager = emf.createEntityManager();
        }
        return manager;
    }
}
