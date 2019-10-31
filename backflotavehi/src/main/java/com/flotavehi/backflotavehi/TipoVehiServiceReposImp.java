/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotavehi.backflotavehi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 503
 */
@Service
public class TipoVehiServiceReposImp implements TipoVehiServiceCRUD {
    //implementar los meodos de service y reposirorios
    
    //con la anotacion @autowited secrea una varible de tipo repocitirio para utilizar 
    //metodos de interface tipovehirepocitorio
    @Autowired
    private TipoVehiRepositorio repositorio;
    
    @Override 
    public List<TipoVehi> listar() {
    return repositorio.findall();
    }
    @Override
    public TipoVehi listarId(int idtv){
    return repositorio.findOne(idtv);
    }
    @Override
    public TipoVehi add(TipoVehi tv){
    return repositorio.save(tv);
    }
    @Override
    public TipoVehi edit(TipoVehi tv){
    return repositorio.save(tv);
    }
    @Override
    public TipoVehi delete(int idtv){
    TipoVehi tv = repositorio.findOne(idtv);
    if(tv != null){
        repositorio.delete(tv);
    }
    return tv;
    }
}
