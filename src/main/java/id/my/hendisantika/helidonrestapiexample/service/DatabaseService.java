package id.my.hendisantika.helidonrestapiexample.service;

import id.my.hendisantika.helidonrestapiexample.dao.CRUD;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * Created by IntelliJ IDEA.
 * Project : helidon-rest-api-example
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 13/02/25
 * Time: 07.00
 * To change this template use File | Settings | File Templates.
 */
public class DatabaseService<M> implements CRUD<M> {
    @PersistenceContext(name = "application")
    private EntityManager manager;

    private final Class<M> targetClass;

    private final String entityName;

    public DatabaseService(Class<M> target, String entityName) {
        this.targetClass = target;
        this.entityName = entityName;
    }
}
