package com.wsdev.EsquadriTech.dto;

import java.time.LocalDateTime;

public class StockMovementResponseDTO
{
    private Long id;
    private Long productId;
    private String productName;

    private Integer typeCode;
    private String typeDescription;

    private Integer quantity;
    private Integer previousQuantity;
    private Integer currentQuantity;

    private LocalDateTime movementDate;

    private String info;
    private String numOrder;

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    public Long getProductId()
    {
        return productId;
    }

    public void setProductId( Long productId )
    {
        this.productId = productId;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName( String productName )
    {
        this.productName = productName;
    }

    public Integer getTypeCode()
    {
        return typeCode;
    }

    public void setTypeCode( Integer typeCode )
    {
        this.typeCode = typeCode;
    }

    public String getTypeDescription()
    {
        return typeDescription;
    }

    public void setTypeDescription( String typeDescription )
    {
        this.typeDescription = typeDescription;
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public void setQuantity( Integer quantity )
    {
        this.quantity = quantity;
    }

    public Integer getPreviousQuantity()
    {
        return previousQuantity;
    }

    public void setPreviousQuantity( Integer previousQuantity )
    {
        this.previousQuantity = previousQuantity;
    }

    public Integer getCurrentQuantity()
    {
        return currentQuantity;
    }

    public void setCurrentQuantity( Integer currentQuantity )
    {
        this.currentQuantity = currentQuantity;
    }

    public LocalDateTime getMovementDate()
    {
        return movementDate;
    }

    public void setMovementDate( LocalDateTime movementDate )
    {
        this.movementDate = movementDate;
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

