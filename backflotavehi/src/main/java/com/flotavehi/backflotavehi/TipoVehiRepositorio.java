/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotavehi.backflotavehi;

import java.util.List;

/**
 *
 * @author 503
 */
public interface TipoVehiRepositorio {
    //declarar los metodos como los nrecomienda spring
    TipoVehi save(TipoVehi tv);
    List<TipoVehi>findall();
    TipoVehi findOne(int idtv);
    void delete(TipoVehi tv);
    
}
