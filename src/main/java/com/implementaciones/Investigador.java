/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementaciones;

import com.control.errores.EjecucionException;
import com.interfaces.IConsejoInvestigacion;
import com.interfaces.IInstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("idBeanInvestigador")
public class Investigador implements IInstructor {
    
    //inyeccion de valor primitivo (podemos eliminar el metodo set)
    @Value("Asignar profesores")
    private String desicionAdministrativa;
    
    //inyeccion automatica por propiedad (podemos eliminar el metodo set)
    @Autowired 
    @Qualifier("idBeanDepInvestigacionImpl")//busca cual es el bean que queremos
    private IConsejoInvestigacion iConsejoInvestigacion;

    public Investigador() {
    }

    @Override
    public void ejecutar() throws EjecucionException {
        System.out.println("tomando desicion administrativa: "+desicionAdministrativa+"");
        iConsejoInvestigacion.tomarDesicionesAdministrativas();
    }

    public String getDesicionAdministrativa() {
        return desicionAdministrativa;
    }
//
    public void setDesicionAdministrativa(String desicionAdministrativa) {
        this.desicionAdministrativa = desicionAdministrativa;
    }

    public IConsejoInvestigacion getiConsejoInvestigacion() {
        return iConsejoInvestigacion;
    }

    public void setiConsejoInvestigacion(IConsejoInvestigacion iConsejoInvestigacion) {
        this.iConsejoInvestigacion = iConsejoInvestigacion;
    }

    @Override
    public void enviarTareas() throws EjecucionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enviarCorreos() throws EjecucionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enviarNotas() throws EjecucionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
