package co.com.juandaza.r2dbc.Entitites;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Usuarios")
@Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsersEntity {

    @Id
    @Column(name ="id_usuario")
    private String id_users;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellido")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "documento_identidad")
    private Number identiifcationNumber;

    @Column(name = "Telefono")
    private Number numberPhone;

    @Column(name = "id_Rol")
    private String idRole;

    @Column(name = "salario_base")
    private Number baseSalary;

    @Column(name = "Fecha_nacimiento")
    private LocalDate birthDate;
}
