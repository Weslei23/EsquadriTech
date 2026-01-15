package com.wsdev.EsquadriTech.controller;

import com.wsdev.EsquadriTech.dto.SupplierDTO;
import com.wsdev.EsquadriTech.service.SupplierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api/v1/supplier" )
public class SupplierController
{
    private SupplierService supplierService;

    /**
     *
     * @return
     * @throws Exception
     */
    @GetMapping
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
    @GetMapping( "/{id}" )
    public SupplierDTO getSupplier( @PathVariable Long id ) throws Exception
    {
        return supplierService.getSupplierById( id );
    }

    /**
     *
     * @param supplierDTO
     * @throws Exception
     */
    @PostMapping( "/addSupplier" )
    public void addSupplier( @RequestBody SupplierDTO supplierDTO ) throws Exception
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
    @PutMapping( "/updateSupplier/{id}" )
    public SupplierDTO updateSupplier( @PathVariable Long id, @RequestBody SupplierDTO supplierDTO ) throws Exception
    {
        supplierService.updateSupplier( id, supplierDTO );
        return supplierDTO;
    }

    /**
     *
     * @param id
     * @throws Exception
     */
    @DeleteMapping( "/deleteSupplier/{id}" )
    public void deleteSupplier( @PathVariable Long id ) throws Exception
    {
        supplierService.deleteSupplier( id );
    }
}
