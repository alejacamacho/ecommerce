package com.ecommerce.backend.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderProduct {
    private Integer id;
    private BigDecimal quantity;
    private BigDecimal price;
    private Integer productId;
    private Order order;
    public BigDecimal getTotalItem(){
        return this.price.multiply(quantity);
    }

}

