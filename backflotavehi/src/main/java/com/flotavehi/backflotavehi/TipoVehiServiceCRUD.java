/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotavehi.backflotavehi;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author 503
 */
public interface TipoVehiServiceCRUD extends Repository<TipoVehi,Integer>{
    //los metodos que avan a servir para opraciones crud
    
    TipoVehi add(TipoVehi tv);
    List<TipoVehi>listar();
    TipoVehi listarId(int idtv);
    TipoVehi edit(TipoVehi tv);
    TipoVehi delete(int idtv);
    
}
