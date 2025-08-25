package Users.gateways;

import Users.Users;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UsersGateway {

    Mono<Users> saveUsers(Users users);

    Mono<List<Users>> getUserAll();
}
