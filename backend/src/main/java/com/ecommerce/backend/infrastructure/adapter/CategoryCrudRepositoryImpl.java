package com.ecommerce.backend.infrastructure.adapter;

import com.ecommerce.backend.domain.model.Category;
import com.ecommerce.backend.domain.port.ICategoryRepository;
import com.ecommerce.backend.infrastructure.mapper.CategoryMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryCrudRepositoryImpl implements ICategoryRepository {

    private final ICategoryCrudRepository iCategoryCrudRepository;
    private final CategoryMapper categoryMapper;

    public CategoryCrudRepositoryImpl(ICategoryCrudRepository iCategoryCrudRepository, CategoryMapper categoryMapper) {
        this.iCategoryCrudRepository = iCategoryCrudRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public Category save(Category category) {
        return categoryMapper.ToCategory( iCategoryCrudRepository.save(categoryMapper.toCategoryEntity(category)));
    }

    @Override
    public Iterable<Category> findAll() {
        return categoryMapper.toCategoryList(iCategoryCrudRepository.findAll());
    }

    @Override
    public Category findByID(Integer id) {
        return categoryMapper.ToCategory(iCategoryCrudRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Categoria con id: " + id + " No existe")
        ));
    }
    @Override
    public void deleteById(Integer id) {

        iCategoryCrudRepository.findById(id).orElseThrow(
                ()->new RuntimeException("Categoria con id: " + id + " No existe")
        );
        iCategoryCrudRepository.deleteById(id);

    }
}