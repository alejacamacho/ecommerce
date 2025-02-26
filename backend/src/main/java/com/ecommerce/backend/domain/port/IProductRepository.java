package com.ecommerce.backend.domain.port;

import com.ecommerce.backend.domain.model.Product;

public interface IProductRepository {
    Product save (Product product);

    Iterable<Product> findAll();
    Product findBy(Integer id);
    void deleteById(Integer id);
}
