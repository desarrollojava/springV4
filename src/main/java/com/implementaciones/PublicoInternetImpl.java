/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementaciones;

import com.interfaces.IPublico;
import org.springframework.stereotype.Component;

@Component
public class PublicoInternetImpl implements IPublico{
    
    private String opiniones;

    @Override
    public void darOpiniones(String opiniones) {
        this.opiniones=opiniones;
    }
    
    public String getOpiniones(){
        return  this.opiniones;
    }
    
}
