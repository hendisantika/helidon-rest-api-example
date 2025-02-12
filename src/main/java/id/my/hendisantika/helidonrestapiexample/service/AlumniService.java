package id.my.hendisantika.helidonrestapiexample.service;

import id.my.hendisantika.helidonrestapiexample.model.Alumni;
import jakarta.enterprise.context.RequestScoped;

/**
 * Created by IntelliJ IDEA.
 * Project : helidon-rest-api-example
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 13/02/25
 * Time: 06.59
 * To change this template use File | Settings | File Templates.
 */
@RequestScoped
public class AlumniService extends DatabaseService<Alumni> {

    public AlumniService() {
        super(Alumni.class, "Alumno");
    }
}
