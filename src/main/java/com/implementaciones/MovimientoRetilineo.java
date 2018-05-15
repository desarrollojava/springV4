/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementaciones;

import com.interfaces.IFisica;
import org.springframework.stereotype.Component;

@Component("idBeanMovimientoRectilineo")
public class MovimientoRetilineo  implements  IFisica{

    @Override
    public void enseniarFisicaPractica() {
       String experimentoPractico="se realiza un experimento practico del tema movimiento rectilineo"; 
       System.out.println("Experimento practico:-->"+experimentoPractico);
    }
    
}
