package com.example.demo;

public interface ProductRepository extends  JpaRepository<Product,Long>{


    List<Product> findByCategory(String category);


}
