package com.ecommerce.backend.domain.port;

import com.ecommerce.backend.domain.model.Category;

public interface ICategoryRepository {
    Category save(Category category);

    Iterable<Category> findAll();
    Category findByID(Integer id);
    void deleteById(Integer id);
}
