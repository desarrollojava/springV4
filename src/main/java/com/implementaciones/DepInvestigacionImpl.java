/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementaciones;

import com.interfaces.IConsejoInvestigacion;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("idBeanDepInvestigacionImpl")
public class DepInvestigacionImpl implements IConsejoInvestigacion{
    
  
    @Override
    public void tomarDesicionesAdministrativas() {
        System.out.println("Asignar profesores para investigacion");   
    }
    
}
