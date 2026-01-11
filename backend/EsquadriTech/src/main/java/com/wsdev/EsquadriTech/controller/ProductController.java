package com.wsdev.EsquadriTech.controller;

import com.wsdev.EsquadriTech.entity.Product;
import com.wsdev.EsquadriTech.repository.ProductRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/api/v1/product" )
public class ProductController
{
    private ProductRepository productRepository;

    public List<Product> getProducts() throws Exception
    {
        return productRepository.findAll();
    }
}
