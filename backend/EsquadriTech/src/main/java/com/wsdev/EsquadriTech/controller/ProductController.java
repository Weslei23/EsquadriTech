package com.wsdev.EsquadriTech.controller;

import com.wsdev.EsquadriTech.dto.ProductDTO;
import com.wsdev.EsquadriTech.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/api/v1/product" )
public class ProductController
{
    private ProductService productService;

    /**
     * Return list products
     *
     * @return
     * @throws Exception
     */
    public List<ProductDTO> getProducts() throws Exception
    {
        return productService.getProducts();
    }

    /**
     * 
     * @param category
     * @return
     */
    public List<ProductDTO> getProductsByCategory( String category )
    {
        return productService.getProductsByCategory( category );
    }

    /**
     * Return product by id
     *
     * @param id
     * @return
     * @throws Exception
     */
    public ProductDTO getProductById( Long id ) throws Exception
    {
        return productService.getProductById( id );
    }

    /**
     * Return product by code
     *
     * @param code
     * @return
     * @throws Exception
     */
    public ProductDTO getProductByCode( String code ) throws Exception
    {
        return productService.getProductByCode( code );
    }

    /**
     * add product
     *
     * @param productDTO
     * @throws Exception
     */
    public void addProduct( ProductDTO productDTO ) throws Exception
    {
        productService.addProduct( productDTO );
    }

    /**
     * Update product
     *
     * @param id
     * @param productDTO
     * @return
     * @throws Exception
     */
    public ProductDTO updateProduct( Long id, ProductDTO productDTO ) throws Exception
    {
        return productService.updateProduct( id, productDTO );
    }

    /**
     * Delete product by id
     *
     * @param id
     * @throws Exception
     */
    public void deleteProduct( Long id ) throws Exception
    {
        productService.deleteProductById( id );
    }

    /**
     *  Delete product by code
     *
     * @param code
     * @throws Exception
     */
    public void deleteProductByCode( String code ) throws Exception
    {
        productService.deleteProductByCode( code );
    }
}
