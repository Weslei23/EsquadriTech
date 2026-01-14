package com.wsdev.EsquadriTech.service;

import com.wsdev.EsquadriTech.dto.ProductDTO;
import com.wsdev.EsquadriTech.dto.mapper.ProductMapper;
import com.wsdev.EsquadriTech.entity.Product;
import com.wsdev.EsquadriTech.repository.ProductRepository;

import java.util.List;

public class ProductService
{
    private ProductRepository productRepository;

    public ProductService( ProductRepository productRepository )
    {
        this.productRepository = productRepository;
    }

    /**
     *  Return product by id.
     * @param id
     * @return
     */
    public ProductDTO getProductById( Long id )
    {
        Product product = productRepository.findById( id )
                .orElseThrow( () -> new RuntimeException( "Product not found with id " + id ) );
        return ProductMapper.entityToDto( product );
    }

    /**
     * Return product by code
     * @param code
     * @return
     */
    public ProductDTO getProductByCode( String code )
    {
        Product product = productRepository.getProductByCode( code ).orElseThrow(() ->
                new RuntimeException( "Product not found with code: " + code ) );
        return ProductMapper.entityToDto( product );
    }

    /**
     *
     * @return
     */
    public List<ProductDTO> getProducts()
    {
        List<Product> products = productRepository.findAll();

        return products.stream().map( ProductMapper::entityToDto ).toList();
    }

    /**
     *
     * @param category
     * @return
     */
    public List<ProductDTO> getProductsByCategory( String category )
    {
        List<Product> products = productRepository.getProductByCategory( category ).orElseThrow( () -> new RuntimeException(" Products not found with category: " + category ) );

        return products.stream().map( ProductMapper::entityToDto ).toList();
    }

    /**
     * Create product
     * @param productDTO
     * @return
     */
    public void addProduct( ProductDTO productDTO )
    {
        productRepository.save( ProductMapper.toEntity( productDTO )  );
    }

    /**
     *
     * @param id
     * @param productDTO
     * @return
     */
    public ProductDTO updateProduct( Long id, ProductDTO productDTO )
    {
        Product product = productRepository.findById( id )
                .orElseThrow( () -> new RuntimeException( "Product not found with id " + id ) );

        product.setName( productDTO.getName() );
        product.setDescription( productDTO.getDescription() );
        product.setPrice( productDTO.getPrice() );
        product.setCategory( productDTO.getCategory() );
        product.setCode( productDTO.getCode() );
        product.setMaxQuantity( productDTO.getMaxQuantity() );
        product.setMinQuantity( productDTO.getMinQuantity() );
        product.setSupplier( productDTO.getSupplier() );

        Product updatedProduct = productRepository.save( product );

        return ProductMapper.entityToDto( updatedProduct );
    }

    /**
     *
     * @param id
     */
    public void deleteProductById( Long id )
    {
        productRepository.deleteById( id );
    }

    /**
     *
     * @param code
     */
    public void deleteProductByCode( String code )
    {
        productRepository.deleteProductByCode( code );
    }
}
