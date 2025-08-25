package co.com.juandaza.r2dbc.mapper;

import Users.Users;
import co.com.juandaza.r2dbc.Entitites.UsersEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring",
        unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE,
        injectionStrategy = org.mapstruct.InjectionStrategy.CONSTRUCTOR)
public interface UsersMapper {
    UsersEntity toEntity(Users users);
    Users toModel(UsersEntity usersEntity);


}
