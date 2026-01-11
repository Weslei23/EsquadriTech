package com.wsdev.EsquadriTech.dto.mapper;

import com.wsdev.EsquadriTech.dto.ProductDTO;
import com.wsdev.EsquadriTech.entity.Product;

import java.util.Collections;
import java.util.List;

public class ProductMapper
{
    /**
     * Convert entity to dto
     *
     * @param product
     * @return
     */
    public static ProductDTO entityToDto( Product product )
    {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId( product.getId() );
        productDTO.setCode( product.getCode() );
        productDTO.setName( product.getName() );
        productDTO.setDescription( product.getDescription() );
        productDTO.setPrice( product.getPrice() );
        productDTO.setCategory( product.getCategory() );
        productDTO.setQuantity( product.getQuantity() );
        productDTO.setMaxQuantity( product.getMaxQuantity() );
        productDTO.setMinQuantity( product.getMinQuantity() );

        return productDTO;
    }

    /**
     * Convert dto to entity
     *
     * @param productDTO
     * @return
     */
    public static Product toEntity( ProductDTO productDTO )
    {
        Product product = new Product();

        product.setId( productDTO.getId() );
        product.setCode( productDTO.getCode() );
        product.setName( productDTO.getName() );
        product.setDescription( productDTO.getDescription() );
        product.setPrice( productDTO.getPrice() );
        product.setCategory( productDTO.getCategory() );
        product.setQuantity( productDTO.getQuantity() );
        product.setMaxQuantity( productDTO.getMaxQuantity() );
        product.setMinQuantity( productDTO.getMinQuantity() );

        return product;
    }
}
