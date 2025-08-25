package Users;

import Users.gateways.UsersGateway;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class UsersUseCase {

    private final UsersGateway usersGateway;


    public Mono<Users> saveUsers(Users users) {
        return usersGateway.saveUsers(users);
    }

    public Mono<List<Users>> getAllUsers(){
        return usersGateway.getUserAll();
    }



}
