package com.ecommerce.backend.infrastructure.mapper;

import com.ecommerce.backend.domain.model.User;
import com.ecommerce.backend.infrastructure.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings(value = {
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "username", target = "username"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "apellido", target = "apellido"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "direccion", target = "direccion"),
            @Mapping(source = "telefono", target = "telefono"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "userType", target = "userType"),
            @Mapping(source = "fechaCreacion", target = "fechaCreacion"),
            @Mapping(source = "fechaActualizacion", target = "fechaActualizacion")
    })
    User toUser(UserEntity userEntity);

    Iterable<User> toUsers(Iterable<UserEntity> userEntities);

    @InheritInverseConfiguration
    UserEntity toUserEntity(User user);
}