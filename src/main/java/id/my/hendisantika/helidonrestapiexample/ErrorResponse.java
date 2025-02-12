package id.my.hendisantika.helidonrestapiexample;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Path;


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
public record ErrorResponse(String field, String message) {
    public ErrorResponse(ConstraintViolation<?> constraint) {
        this(getSimplePath(constraint.getPropertyPath()), constraint.getMessage());
    }

    public static String getSimplePath(Path path) {
        String token = path.toString();
        return token.substring(token.lastIndexOf(".") + 1);
    }
}
