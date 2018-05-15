/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementaciones;

import com.interfaces.IConsejoInvestigacion;

/**
 *
 * @author admin
 */
public class DepDisciplinaImpl  implements IConsejoInvestigacion{

    @Override
    public void tomarDesicionesAdministrativas() {
        System.out.println("Sancionar a profesores que no cumplen sus tareas de investigacion"); 
    }
    
}
