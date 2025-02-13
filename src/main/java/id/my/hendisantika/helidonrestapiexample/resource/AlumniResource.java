package id.my.hendisantika.helidonrestapiexample.resource;

import id.my.hendisantika.helidonrestapiexample.dto.AlumniPayload;
import id.my.hendisantika.helidonrestapiexample.model.Alumni;
import id.my.hendisantika.helidonrestapiexample.service.AlumniService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

import java.util.List;

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

    @GET
    @Produces("application/json")
    public List<Alumni> list() {
        return this.alumniService.list().page(1).get();
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Transactional
    public Alumni insert(@Valid AlumniPayload alu) {
        Alumni a = new Alumni();
        alu.enrich(a);
        return this.alumniService.insert(a);
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response retrieve(@PathParam(value = "id") Integer id) {
        return this.alumniService.get(id)
                .map((alu) -> Response.ok(alu).build())
                .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response delete(@PathParam(value = "id") Integer id) {
        this.alumniService.get(id).ifPresent(alu -> this.alumniService.delete(alu));
        return Response.noContent().build();
    }

}
