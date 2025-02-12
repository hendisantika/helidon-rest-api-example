package id.my.hendisantika.helidonrestapiexample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : helidon-rest-api-example
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 13/02/25
 * Time: 06.54
 * To change this template use File | Settings | File Templates.
 */
@Data
@Entity
@Table(name = "matriculasi")
public class Matriculasi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula")
    private Long id;

    @OneToOne
    @JoinColumn(name = "alumno")
    private Alumni alumno;

    @OneToOne
    @JoinColumn(name = "asignatura")
    private Subject subject;

    @Column(name = "date")
    private int date;

    @Column
    private int nota;
}
