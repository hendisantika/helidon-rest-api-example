package id.my.hendisantika.helidonrestapiexample;

import jakarta.validation.ConstraintViolationException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : helidon-rest-api-example
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 13/02/25
 * Time: 06.57
 * To change this template use File | Settings | File Templates.
 */
@Provider
public class ConstraintValidationProvider implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(ConstraintViolationException exception) {
        List<ErrorResponse> errors = exception.getConstraintViolations()
                .stream()
                .map(e -> new ErrorResponse(e))
                .toList();
        return Response
                .status(Response.Status.BAD_REQUEST)
                .entity(errors)
                .build();
    }
}
