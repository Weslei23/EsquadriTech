package com.wsdev.EsquadriTech.dto.mapper;

import com.wsdev.EsquadriTech.dto.ProductDTO;
import com.wsdev.EsquadriTech.dto.StockMovementRequestDTO;
import com.wsdev.EsquadriTech.dto.StockMovementResponseDTO;
import com.wsdev.EsquadriTech.entity.Product;
import com.wsdev.EsquadriTech.entity.StockMovement;

public class StockMovementMapper
{
    public static StockMovementResponseDTO entityToDto( StockMovement stockMovement )
    {
        StockMovementResponseDTO stockMovementResponseDTO = new StockMovementResponseDTO();
        stockMovementResponseDTO.setId( stockMovementResponseDTO.getId() );
        stockMovementResponseDTO.setMovementDate( stockMovementResponseDTO.getMovementDate() );
        stockMovementResponseDTO.setProductId( stockMovementResponseDTO.getProductId() );
        stockMovementResponseDTO.setInfo( stockMovementResponseDTO.getInfo() );
        stockMovementResponseDTO.setNumOrder( stockMovementResponseDTO.getNumOrder() );
        stockMovementResponseDTO.setPreviousQuantity( stockMovementResponseDTO.getPreviousQuantity() );
        stockMovementResponseDTO.setQuantity( stockMovementResponseDTO.getQuantity() );
        stockMovementResponseDTO.setCurrentQuantity( stockMovementResponseDTO.getCurrentQuantity() );
//        stockMovementResponseDTO.set( product.getMinQuantity() );
//        stockMovementResponseDTO.setSupplier( product.getSupplier() );

        return productDTO;
    }

    /**
     * Convert dto to entity
     *
     * @param productDTO
     * @return
     */
    public static StockMovement toEntity( StockMovementRequestDTO stockMovementRequestDTO )
    {
        StockMovement stockMovement = new StockMovement();

        stockMovement.setInfo( stockMovementRequestDTO.getInfo() );
        stockMovement.setNumOrder( stockMovementRequestDTO.getNumOrder() );
        stockMovement.setType( stockMovementRequestDTO.getType() );
        stockMovement.setProduct( stockMovementRequestDTO.getProductId() );
        stockMovement.setQuantity( stockMovementRequestDTO.getQuantity() );

        return stockMovement;
    }
}
