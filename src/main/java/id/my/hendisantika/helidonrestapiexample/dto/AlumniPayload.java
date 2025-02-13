package id.my.hendisantika.helidonrestapiexample.dto;

import id.my.hendisantika.helidonrestapiexample.model.Alumni;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Getter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * Project : helidon-rest-api-example
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 12/02/25
 * Time: 15.44
 * To change this template use File | Settings | File Templates.
 */
public record AlumniPayload(
        @Schema @NotNull @NotBlank @Getter String fullName,
        @Schema @NotNull @NotBlank String number,
        @Schema @NotNull @Past LocalDate birthday
) {
    public void enrich (Alumni alumni){
        alumni.setNumber(number);
        alumni.setFullName(fullName);
        alumni.setBirthDate(birthday);
    }
}
