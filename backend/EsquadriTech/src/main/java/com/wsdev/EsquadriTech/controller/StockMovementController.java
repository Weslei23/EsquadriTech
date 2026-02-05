package com.wsdev.EsquadriTech.controller;

import com.wsdev.EsquadriTech.dto.StockMovementRequestDTO;
import com.wsdev.EsquadriTech.service.StockMovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/api/v1/movements" )
public class StockMovementController
{
    @Autowired
    private StockMovementService stockMovementService;

    @PostMapping( "registerMovement" )
    public void registerStockMovement( StockMovementRequestDTO stockMovementRequestDTO ) throws  Exception
    {
        stockMovementService.registerStockMovement( stockMovementRequestDTO );
    }
}
