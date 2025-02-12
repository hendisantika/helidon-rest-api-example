package id.my.hendisantika.helidonrestapiexample.dao;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : helidon-rest-api-example
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 13/02/25
 * Time: 06.56
 * To change this template use File | Settings | File Templates.
 */
public interface Query {
    Query<T> page(int pag);

    Query<T> limit(int limit);

    List<T> get();
}
