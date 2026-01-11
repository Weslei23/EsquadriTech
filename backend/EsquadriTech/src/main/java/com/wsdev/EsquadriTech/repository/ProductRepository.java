package com.wsdev.EsquadriTech.repository;

import com.wsdev.EsquadriTech.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long>
{
    Optional<Product> getProductByCode( String code );
    void deleteProductByCode( String code );
    Optional<List<Product>> getProductByCategory(String category );
}
