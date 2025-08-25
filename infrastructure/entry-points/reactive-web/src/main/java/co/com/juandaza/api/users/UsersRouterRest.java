package co.com.juandaza.api.users;

import api.Handler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class UsersRouterRest {
    @Bean
    public RouterFunction<ServerResponse> routerFunction(UsersHandler useHandler) {
        return route(GET("/api/v1/usuarios"), useHandler::listenGETUseCase);
}
}
