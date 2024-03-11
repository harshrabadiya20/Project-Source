package com.onlineshoppingapp.productservice.repository;
import com.onlineshoppingapp.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String>{

}