package com.ecommerce.backend.infrastructure.adapter;

import com.ecommerce.backend.domain.model.Product;
import com.ecommerce.backend.domain.port.IProductRepository;
import com.ecommerce.backend.infrastructure.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ProductCrudRepositoryImpl implements IProductRepository {

    public ProductCrudRepositoryImpl(IProductCrudRepository iProductCrudRepository, ProductMapper productMapper) {
        this.iProductCrudRepository = iProductCrudRepository;
        this.productMapper = productMapper;
    }

    private final IProductCrudRepository iProductCrudRepository;
    private final ProductMapper productMapper;



    @Override
    public Product save(Product product) {
        return productMapper.toProduct(iProductCrudRepository.save(productMapper.toProductEntity(product)));
    }


    @Override
    public Iterable<Product> findAll() {
        return productMapper.toProductList(iProductCrudRepository.findAll());
    }

    @Override
    public Product findBy(Integer id) {
        return productMapper.toProduct(iProductCrudRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Producto con id: "+id+" no se encuentra")

        ));
    }

    @Override
    public void deleteById(Integer id) {
        iProductCrudRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Producto con id: "+id+" no se encuentra")
        );
        iProductCrudRepository.deleteById(id);
    }
}
