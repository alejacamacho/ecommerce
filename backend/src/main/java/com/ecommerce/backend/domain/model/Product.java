package com.ecommerce.backend.domain.model;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    private  Integer id;
    private String nombrep;
    private String codigo;
    private String descripcion;
    private String urlImagen;
    private BigDecimal precio;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;
    private Integer userId;
    private Integer categoriaId;

}
