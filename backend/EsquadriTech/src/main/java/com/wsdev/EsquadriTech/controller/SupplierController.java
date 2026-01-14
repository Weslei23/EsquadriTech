package com.wsdev.EsquadriTech.controller;

import com.wsdev.EsquadriTech.dto.SupplierDTO;
import com.wsdev.EsquadriTech.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/api/v1/supplier" )
public class SupplierController
{
    @Autowired
    private SupplierService supplierService;

    /**
     *
     * @return
     * @throws Exception
     */
    public List<SupplierDTO> getSuppliers() throws Exception
    {
        return supplierService.getSuppliers();
    }

    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    public SupplierDTO getSupplier( Long id ) throws Exception
    {
        return supplierService.getSupplierById( id );
    }

    /**
     *
     * @param supplierDTO
     * @throws Exception
     */
    public void addSupplier( SupplierDTO supplierDTO ) throws Exception
    {
        supplierService.addSupplier( supplierDTO );
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
        supplierService.updateSupplier( id, supplierDTO );
        return supplierDTO;
    }

    /**
     *
     * @param id
     * @throws Exception
     */
    public void deleteSupplier( Long id ) throws Exception
    {
        supplierService.deleteSupplier( id );
    }
}
