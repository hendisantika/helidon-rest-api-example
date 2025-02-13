package id.my.hendisantika.helidonrestapiexample.resource;

import id.my.hendisantika.helidonrestapiexample.service.AlumniService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Path;

/**
 * Created by IntelliJ IDEA.
 * Project : helidon-rest-api-example
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 13/02/25
 * Time: 07.04
 * To change this template use File | Settings | File Templates.
 */
@Path("/alumni")
public class AlumniResource {

    private final AlumniService alumniService;

    @Inject
    public AlumniResource(AlumniService alumniService) {
        this.alumniService = alumniService;
    }
}
