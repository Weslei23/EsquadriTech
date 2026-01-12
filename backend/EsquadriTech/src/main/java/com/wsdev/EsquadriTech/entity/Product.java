package com.wsdev.EsquadriTech.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table( name = "tb_products" )
public class Product
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String description;
    private Double price;
    private int quantity;
    private int minQuantity;
    private int maxQuantity;

    @ManyToOne
    @JoinColumn( name = "supplier_id", nullable = false )
    private Supplier supplier;

    private String category;
    private String code;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public LocalDateTime getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt( LocalDateTime updatedAt )
    {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt( LocalDateTime createdAt )
    {
        this.createdAt = createdAt;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode( String code )
    {
        this.code = code;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory( String category )
    {
        this.category = category;
    }

    public int getMaxQuantity()
    {
        return maxQuantity;
    }

    public void setMaxQuantity( int maxQuantity )
    {
        this.maxQuantity = maxQuantity;
    }

    public int getMinQuantity()
    {
        return minQuantity;
    }

    public void setMinQuantity( int minQuantity )
    {
        this.minQuantity = minQuantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity( int quantity )
    {
        this.quantity = quantity;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice( Double price )
    {
        this.price = price;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    public Supplier getSupplier()
    {
        return supplier;
    }

    public void setSupplier( Supplier supplier )
    {
        this.supplier = supplier;
    }
}
