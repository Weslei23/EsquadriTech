package com.wsdev.EsquadriTech.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class StockMovementRequestDTO
{

    @NotNull
    private Long productId;

    @NotNull
    private Integer typeCode;

    @NotNull
    @Min(1)
    private Integer quantity;

    @Size(max = 255)
    private String info;

    @Size(max = 50)
    private String numOrder;

    public Long getProductId()
    {
        return productId;
    }

    public void setProductId( Long productId )
    {
        this.productId = productId;
    }

    public Integer getTypeCode()
    {
        return typeCode;
    }

    public void setTypeCode( Integer typeCode )
    {
        this.typeCode = typeCode;
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public void setQuantity( Integer quantity )
    {
        this.quantity = quantity;
    }

    public String getInfo()
    {
        return info;
    }

    public void setInfo( String info )
    {
        this.info = info;
    }

    public String getNumOrder()
    {
        return numOrder;
    }

    public void setNumOrder( String numOrder )
    {
        this.numOrder = numOrder;
    }
}

