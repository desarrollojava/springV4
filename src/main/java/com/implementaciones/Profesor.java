/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementaciones;

import com.control.errores.EjecucionException;
import com.interfaces.IInstructor;
import org.springframework.stereotype.Component;

@Component("idBeanProfesor")
public class Profesor implements IInstructor{
    
    private int numeroAsignaturas=8;

    public Profesor() {
    }
    
     public Profesor(int numeroAsignaturas) {
         this.numeroAsignaturas=numeroAsignaturas;
    }
    
    
    @Override
    public void ejecutar() throws EjecucionException {
        System.out.println("enseño:  "+numeroAsignaturas+ " temas de la asignatura de matematica");
        
    }

    public int getNumeroAsignaturas() {
        return numeroAsignaturas;
    }

    public void setNumeroAsignaturas(int numeroAsignaturas) {
        this.numeroAsignaturas = numeroAsignaturas;
    }
    
    
}
