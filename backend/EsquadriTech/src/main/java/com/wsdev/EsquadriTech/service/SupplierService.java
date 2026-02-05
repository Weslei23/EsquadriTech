package com.wsdev.EsquadriTech.service;

import com.wsdev.EsquadriTech.dto.SupplierDTO;
import com.wsdev.EsquadriTech.dto.mapper.SupplierMapper;
import com.wsdev.EsquadriTech.entity.Supplier;
import com.wsdev.EsquadriTech.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService
{
    @Autowired
    private SupplierRepository supplierRepository;

    /**
     *
     * @return
     * @throws Exception
     */
    public List<SupplierDTO> getSuppliers() throws Exception
    {
        List<Supplier> suppliers = supplierRepository.findAll();

        return suppliers.stream().map( SupplierMapper::entityToDto ).toList();
    }

    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    public SupplierDTO getSupplierById( Long id ) throws Exception
    {
        Supplier supplier = supplierRepository.findById( id ).orElseThrow( () -> new RuntimeException( "Supplier not found with id: " + id ) );

        return SupplierMapper.entityToDto( supplier );
    }

    /**
     *
     * @param supplierDTO
     * @throws Exception
     */
    public void addSupplier( SupplierDTO supplierDTO ) throws Exception
    {
        supplierRepository.save( SupplierMapper.toEntity( supplierDTO ) );
    }

    /**
     *
     * @param id
     * @param supplierDTO
     * @return
     * @throws Exception
     */
    public SupplierDTO updateSupplier( Long id, SupplierDTO supplierDTO ) throws Exception
    {
        Supplier supplier = supplierRepository.findById( id ).orElseThrow( () -> new RuntimeException( "Supplier not found with id: " + id ) );

        supplier.setName( supplierDTO.getName() );
        supplier.setEmail( supplierDTO.getEmail() );
        supplier.setPhone( supplierDTO.getPhone() );
        supplier.setActive( supplierDTO.getActive() );
        supplier.setCity( supplierDTO.getCity() );
        supplier.setNeighborhood( supplierDTO.getNeighborhood() );
        supplier.setNumber( supplierDTO.getNumber() );
        supplier.setStreet( supplierDTO.getStreet() );
        supplier.setZipCode( supplierDTO.getZipCode() );
        supplier.setProducts( supplierDTO.getProducts() );
        supplier.setCnpj( supplierDTO.getCnpj() );
        supplier.setState( supplierDTO.getState() );
        supplier.setPhone( supplierDTO.getPhone() );

        Supplier updateSupplier = supplierRepository.save( supplier );

        return SupplierMapper.entityToDto( updateSupplier );
    }

    /**
     *
     * @param id
     * @throws Exception
     */
    public void deleteSupplier( Long id ) throws Exception
    {
        supplierRepository.deleteById( id );
    }
}
