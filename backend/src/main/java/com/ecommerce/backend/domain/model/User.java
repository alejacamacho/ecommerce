package com.ecommerce.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private Integer id;
    private String username;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String telefono;
    private String password;
    private UserType userType;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

}
