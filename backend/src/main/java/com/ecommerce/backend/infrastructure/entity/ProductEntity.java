package com.ecommerce.backend.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  Integer id;
    private String nombrep;
    private String codigo;
    private String descripcion;
    private String urlImagen;
    private BigDecimal precio;
    @CreationTimestamp
    private LocalDateTime fechaCreacion;
    @UpdateTimestamp
    private LocalDateTime fechaActualizacion;
    @ManyToOne
    private UserEntity userEntity;
    @ManyToOne
    private CategoryEntity categoryEntity;
}
