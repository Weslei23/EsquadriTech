package com.wsdev.EsquadriTech.controller;

import com.wsdev.EsquadriTech.dto.ProductDTO;
import com.wsdev.EsquadriTech.service.ProductService;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping
    public List<ProductDTO> getProducts() throws Exception
    {
        return productService.getProducts();
    }

    /**
     * 
     * @param category
     * @return
     */
    @GetMapping( "/{category}" )
    public List<ProductDTO> getProductsByCategory( @RequestBody String category )
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
    @GetMapping( "/{id}" )
    public ProductDTO getProductById( @PathVariable Long id ) throws Exception
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
    @GetMapping( "/{code}" )
    public ProductDTO getProductByCode( @PathVariable String code ) throws Exception
    {
        return productService.getProductByCode( code );
    }

    /**
     * add product
     *
     * @param productDTO
     * @throws Exception
     */
    @PostMapping( "/addProduct" )
    public void addProduct( @RequestBody ProductDTO productDTO ) throws Exception
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
    @PutMapping( "/updateProduct/{id}" )
    public ProductDTO updateProduct( @PathVariable Long id, @RequestBody ProductDTO productDTO ) throws Exception
    {
        return productService.updateProduct( id, productDTO );
    }

    /**
     * Delete product by id
     *
     * @param id
     * @throws Exception
     */
    @DeleteMapping( "/deleteProduct/{id}" )
    public void deleteProduct( @PathVariable Long id ) throws Exception
    {
        productService.deleteProductById( id );
    }

    /**
     *  Delete product by code
     *
     * @param code
     * @throws Exception
     */
    @DeleteMapping( "/deleteProduct/{code}" )
    public void deleteProductByCode( String code ) throws Exception
    {
        productService.deleteProductByCode( code );
    }
}
