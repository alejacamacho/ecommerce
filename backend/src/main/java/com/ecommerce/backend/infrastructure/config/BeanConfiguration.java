package com.ecommerce.backend.infrastructure.config;

import com.ecommerce.backend.application.CategoryService;
import com.ecommerce.backend.application.OrderService;
import com.ecommerce.backend.application.ProductService;
import com.ecommerce.backend.application.UserService;
import com.ecommerce.backend.domain.port.ICategoryRepository;
import com.ecommerce.backend.domain.port.IOrderRepository;
import com.ecommerce.backend.domain.port.IUserRepository;
import com.ecommerce.backend.domain.port.IProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public UserService userService(IUserRepository iUserRepository) {
        return  new UserService(iUserRepository);

    }

    @Bean
    public CategoryService categoryService(ICategoryRepository iCategoryRepository){
        return new CategoryService(iCategoryRepository);
    }

   @Bean
    public ProductService productService(IProductRepository iproductRepository){
        return new ProductService(iproductRepository);
   }

    @Bean
    public OrderService orderService(IOrderRepository iOrderRepository){
        return new OrderService(iOrderRepository);
    }
}