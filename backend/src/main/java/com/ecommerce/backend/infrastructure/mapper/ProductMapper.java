package com.ecommerce.backend.infrastructure.mapper;

import com.ecommerce.backend.domain.model.Product;
import com.ecommerce.backend.infrastructure.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Mapper(componentModel = "spring")

public interface ProductMapper {

    @Mappings( value = {
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nombrep", target = "nombrep"),
            @Mapping(source = "codigo", target = "codigo"),
            @Mapping(source = "descripcion", target = "descripcion"),
            @Mapping(source = "urlImagen", target = "urlImagen"),
            @Mapping(source = "precio", target = "precio"),
            @Mapping(source = "fechaCreacion", target = "fechaCreacion"),
            @Mapping(source = "fechaActualizacion", target = "fechaActualizacion"),
            @Mapping(source = "userEntity.id", target = "userId"),
            @Mapping(source = "categoryEntity.id", target = "categoriaId"),


})
    Product toProduct(ProductEntity productEntity);
    Iterable<Product> toProductList (Iterable<ProductEntity> productEntities);

    @InheritInverseConfiguration
    ProductEntity toProductEntity(Product product);
}
