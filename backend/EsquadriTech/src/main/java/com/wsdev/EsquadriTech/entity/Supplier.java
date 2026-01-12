package com.wsdev.EsquadriTech.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "tb_suppliers" )
public class Supplier
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String cnpj;
    private String street;
    private String number;
    private String neighborhood;
    private String city;
    private String state;
    private String zipCode;
    private String phone;
    private String email;
    private Boolean active;

    @OneToMany( mappedBy = "supplier", cascade = CascadeType.ALL, orphanRemoval = true )
    private List<Product> products = new ArrayList<>();

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getCnpj()
    {
        return cnpj;
    }

    public void setCnpj( String cnpj )
    {
        this.cnpj = cnpj;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet( String street )
    {
        this.street = street;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber( String number )
    {
        this.number = number;
    }

    public String getNeighborhood()
    {
        return neighborhood;
    }

    public void setNeighborhood( String neighborhood )
    {
        this.neighborhood = neighborhood;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity( String city )
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState( String state )
    {
        this.state = state;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setZipCode( String zipCode )
    {
        this.zipCode = zipCode;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone( String phone )
    {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public Boolean getActive()
    {
        return active;
    }

    public void setActive( Boolean active )
    {
        this.active = active;
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public void setProducts( List<Product> products )
    {
        this.products = products;
    }

    public LocalDateTime getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt( LocalDateTime createdAt )
    {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt( LocalDateTime updatedAt )
    {
        this.updatedAt = updatedAt;
    }
}
