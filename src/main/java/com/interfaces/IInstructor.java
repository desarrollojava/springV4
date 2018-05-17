/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces;

import com.control.errores.EjecucionException;


public interface IInstructor {
    public void ejecutar() throws EjecucionException;
    
    public void enviarTareas() throws EjecucionException;
    
    public void enviarCorreos() throws EjecucionException;
    
    public void enviarNotas() throws EjecucionException;
    
}
