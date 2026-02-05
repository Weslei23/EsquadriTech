package com.wsdev.EsquadriTech.service;

import com.wsdev.EsquadriTech.dto.ProductDTO;
import com.wsdev.EsquadriTech.dto.StockMovementRequestDTO;
import com.wsdev.EsquadriTech.enums.StockMovementType;
import com.wsdev.EsquadriTech.repository.StockMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockMovementService
{
    @Autowired
    private StockMovementRepository stockMovementRepository;

    @Autowired
    private ProductService productService;

    public void registerStockMovement( StockMovementRequestDTO requestDTO ) throws Exception
    {
        ProductDTO productDTO = productService.getProductById( requestDTO.getProductId() );

        if ( requestDTO.getType() == StockMovementType.SAIDA )
        {
            if ( productDTO.getQuantity() < requestDTO.getQuantity() )
            {
                throw new RuntimeException("Estoque insuficiente");
            }
        }

        if ( requestDTO.getType() == StockMovementType.ENTRADA )
        {
            int newQuatity = requestDTO.getQuantity() + productDTO.getQuantity();

            productDTO.setQuantity( newQuatity );
        }

        if ( requestDTO.getType() == StockMovementType.AJUSTE )
        {
            productDTO.setQuantity(  requestDTO.getQuantity() );
        }
    }
}
