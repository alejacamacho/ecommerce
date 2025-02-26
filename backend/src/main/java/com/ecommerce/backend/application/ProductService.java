package com.ecommerce.backend.application;

import com.ecommerce.backend.domain.model.Product;
import com.ecommerce.backend.domain.port.IProductRepository;

public class ProductService {
    private final IProductRepository iproductRepository;

    public ProductService(IProductRepository iproductRepository) {
        this.iproductRepository = iproductRepository;
    }

    public Product save(Product product) {
        return  this.iproductRepository.save(product);
    }
    public Iterable<Product> findAll() {
        return this.iproductRepository.findAll();
    }
    public Product findById(Integer id){
        return this.iproductRepository.findBy(id);
    }
    public void deleteById(Integer id){
        this.iproductRepository.deleteById(id);
    }



}
