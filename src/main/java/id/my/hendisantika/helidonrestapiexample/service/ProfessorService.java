package id.my.hendisantika.helidonrestapiexample.service;

import id.my.hendisantika.helidonrestapiexample.model.Professor;
import jakarta.enterprise.context.RequestScoped;

/**
 * Created by IntelliJ IDEA.
 * Project : helidon-rest-api-example
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 13/02/25
 * Time: 07.03
 * To change this template use File | Settings | File Templates.
 */
@RequestScoped
public class ProfessorService extends DatabaseService<Professor> {

    public ProfessorService() {
        super(Professor.class, "Professor");
    }
}
