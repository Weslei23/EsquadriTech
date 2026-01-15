package com.wsdev.EsquadriTech.entity;

import com.wsdev.EsquadriTech.enums.StockMovementType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table( name = "tb_movements" )
public class StockMovement
{
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false )
    @JoinColumn( name = "product_id", nullable = false )
    private Product product;

    @Column(name = "movement_type", nullable = false )
    private StockMovementType type;

    @Column( nullable = false )
    private Integer quantity;

    @Column( name = "movement_date", nullable = false )
    private LocalDateTime movementDate;

    @Column( length = 255 )
    private String info;

    @Column( name = "order_number", length = 50 )
    private String numOrder;

    @Column( name = "previous_quantity", nullable = false )
    private Integer previousQuantity;

    @Column( name = "current_quantity", nullable = false )
    private Integer currentQuantity;

    @Column( name = "created_at", nullable = false, updatable = false )
    @CreationTimestamp
    private LocalDateTime createdAt;

    protected StockMovement()
    {
    }

    public StockMovement( Product product, StockMovementType type, Integer quantity, Integer previousQuantity, Integer currentQuantity, String info, String numOrder )
    {
        this.product = product;
        this.type = type;
        this.quantity = quantity;
        this.previousQuantity = previousQuantity;
        this.currentQuantity = currentQuantity;
        this.info = info;
        this.numOrder = numOrder;
    }

    @PrePersist
    private void prePersist()
    {
        this.createdAt = LocalDateTime.now();
        this.movementDate = LocalDateTime.now();
    }

    public Long getId()
    {
        return id;
    }

    public Product getProduct()
    {
        return product;
    }

    public void setProduct( Product product )
    {
        this.product = product;
    }

    public StockMovementType getType()
    {
        return type;
    }

    public void setType( StockMovementType type )
    {
        this.type = type;
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public void setQuantity( Integer quantity )
    {
        this.quantity = quantity;
    }

    public LocalDateTime getMovementDate()
    {
        return movementDate;
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

    public Integer getPreviousQuantity()
    {
        return previousQuantity;
    }

    public Integer getCurrentQuantity()
    {
        return currentQuantity;
    }

    public LocalDateTime getCreatedAt()
    {
        return createdAt;
    }

    @Override
    public boolean equals( Object object )
    {
        if ( this == object ) return true;

        if ( ! ( object instanceof StockMovement ) ) return false;

        StockMovement stockMovement = ( StockMovement ) object;

        return id != null && id.equals( stockMovement.id );
    }

    @Override
    public int hashCode()
    {
        return getClass().hashCode();
    }
}

