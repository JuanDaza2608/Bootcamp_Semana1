package co.com.juandaza.r2dbc.Users;

import co.com.juandaza.r2dbc.Entitites.UsersEntity;
import co.com.juandaza.r2dbc.mapper.UsersMapper;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Repository;

import java.time.Duration;

@Repository
public class UsersRepository {
    private final UsersMapper mapper;
    private final DatabaseClient databaseClient;

    static final String GET_USERS_QUERY = "SELECT * FROM bootcamp.usuario";


    public UsersRepository(UsersMapper mapper, DatabaseClient databaseClient) {
        this.mapper = mapper;
        this.databaseClient = databaseClient;
    }

    public Mono<UsersEntity> getAllUsers(){
        return databaseClient.sql(GET_USERS_QUERY)
                .map(GetUsers::getUsersEntity)
                .one()
                .timeout(Duration.ofSeconds(5))
                .onErrorResume(error -> Mono.error(new TechnicalExcpetionMessage.ERROR_GETTING_USERS)));
    }
}
