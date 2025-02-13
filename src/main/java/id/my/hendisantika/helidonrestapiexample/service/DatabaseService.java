package id.my.hendisantika.helidonrestapiexample.service;

import id.my.hendisantika.helidonrestapiexample.dao.CRUD;
import id.my.hendisantika.helidonrestapiexample.dao.Query;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

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

    class QueryBuilder implements Query<M> {

        private int page = 1;

        private int limit = 10;

        @Override
        public Query<M> page(int pag) {
            this.page = pag;
            return this;
        }

        @Override
        public Query<M> limit(int limit) {
            this.limit = limit;
            return this;
        }

        @Override
        public List<M> get() {
            String query = "SELECT e FROM {e} e".replace("{e}", entityName);
            int offset = (page - 1) * limit;
            return (List<M>) manager.createQuery(query)
                    .setMaxResults(limit)
                    .setFirstResult(offset)
                    .getResultList();

        }
    }

    @Override
    public Query<M> list() {
        return new QueryBuilder();
    }
}
