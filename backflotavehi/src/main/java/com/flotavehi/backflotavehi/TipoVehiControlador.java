/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotavehi.backflotavehi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.PatnVariable;

/**
 *
 * @author 503
 */
//referencia al proyecto front/*end
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController 
@RequestMapping({"/backflotavehi"})

public class TipoVehiControlador {
    //se hara referencia al proyecto front-ent,brindandole los servise
    @Autowired
    TipoVehiServiceCRUD service;
    
    @GetMapping
    public List<TipoVehi> listar() {
    return service.listar();
    }
    
    
    @PostMapping
    public TipoVehi agregar(@RequestBody TipoVehi tv)  {
    //la anotacion @RequestBody des serializa el json
        return service.add(tv);
        
    }
    @GetMapping(path = {"/{idtv}"})
    public TipoVehi listarId(@PathVariable("idtv")int idtv ) {
    return service.listarId(idtv);
    }
    @GetMapping(path = {"/{idtv}"})
    public TipoVehi editar(@RequestBody TipoVehi tv, @PathVariable("idtv")int idtv ){
    tv.setIdtv(idtv);
    return service.edit(tv);
    }
    @DeleteMapping(path = {"/{idtv}"})
    public TipoVehi delete(@PathVariable("idtv")int idtv ){
    return service.delete(idtv);
    }
}
