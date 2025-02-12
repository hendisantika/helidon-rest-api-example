package id.my.hendisantika.helidonrestapiexample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : helidon-rest-api-example
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 12/02/25
 * Time: 15.57
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "professors")
@Data
public class Professor {
    @Column(name = "id_professor")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "fullname")
    private String fullName;
}
