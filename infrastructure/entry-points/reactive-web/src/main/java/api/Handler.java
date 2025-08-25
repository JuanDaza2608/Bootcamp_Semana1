package api;

import Users.Users;
import Users.UsersUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
//private  final UseCase useCase;
//private  final UseCase2 useCase2;

    public Mono<ServerResponse> listenGETUsersUserCase(ServerRequest serverRequest) {
        //UsersUseCase.saveUsers();
        return ServerResponse.ok().bodyValue("");
    }

    
}
