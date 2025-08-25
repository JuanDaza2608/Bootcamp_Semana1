package co.com.juandaza.r2dbc.util;

import co.com.juandaza.r2dbc.Entitites.UsersEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GetUsers {
    public static UsersEntity getUserEntity(io.r2dbc.spi.Readable row){
        return UsersEntity.builder()
                .id_users()
                .name()
                .email()
                .birthDate()
                .identiifcationNumber()
                .idRole()
                .build();
    }
}
