package Users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Users {

    private String id_users;

    private String name;

    private String surname;

    private String email;

    private Number identiifcationNumber;

    private Number numberPhone;

    private String idRole;

    private Number baseSalary;

    private LocalDate birthDate;

}
