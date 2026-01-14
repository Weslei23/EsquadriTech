package com.wsdev.EsquadriTech.dto.mapper;

import com.wsdev.EsquadriTech.dto.ProductDTO;
import com.wsdev.EsquadriTech.dto.SupplierDTO;
import com.wsdev.EsquadriTech.entity.Product;
import com.wsdev.EsquadriTech.entity.Supplier;

public class SupplierMapper
{
    public static SupplierDTO entityToDto( Supplier supplier )
    {
        SupplierDTO supplierDTO = new SupplierDTO();

        supplierDTO.setId( supplier.getId() );
        supplierDTO.setName( supplier.getName() );
        supplierDTO.setEmail( supplier.getEmail() );
        supplierDTO.setPhone( supplier.getPhone() );
        supplierDTO.setCity( supplier.getCity() );
        supplierDTO.setZipCode( supplier.getZipCode() );
        supplierDTO.setCnpj( supplier.getCnpj() );
        supplierDTO.setActive( supplier.getActive() );
        supplierDTO.setProducts( supplier.getProducts() );
        supplierDTO.setNeighborhood( supplier.getNeighborhood() );
        supplierDTO.setState( supplier.getState() );
        supplierDTO.setStreet( supplier.getStreet() );
        supplierDTO.setNumber( supplier.getNumber() );

        return supplierDTO;
    }

    public static Supplier toEntity( SupplierDTO supplierDTO )
    {
        Supplier supplier = new Supplier();

        supplier.setId( supplierDTO.getId() );
        supplier.setName( supplierDTO.getName() );
        supplier.setEmail( supplierDTO.getEmail() );
        supplier.setPhone( supplierDTO.getPhone() );
        supplier.setCity( supplierDTO.getCity() );
        supplier.setZipCode( supplierDTO.getZipCode() );
        supplier.setCnpj( supplierDTO.getCnpj() );
        supplier.setActive( supplierDTO.getActive() );
        supplier.setProducts( supplierDTO.getProducts() );
        supplier.setNeighborhood( supplierDTO.getNeighborhood() );
        supplier.setState( supplierDTO.getState() );
        supplier.setStreet( supplierDTO.getStreet() );
        supplier.setNumber( supplierDTO.getNumber() );

        return supplier;
    }
}
