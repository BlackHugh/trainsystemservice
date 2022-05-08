package com.citi.trainingsystem.repository;

import com.citi.trainingsystem.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends CrudRepository<Product, Long> {

    @Query("select p from Product p where p.name=:name")
    public Product findProductByName(@Param("name") String name);

    public Product findByName(String username);
}
