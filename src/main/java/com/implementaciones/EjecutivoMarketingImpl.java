/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementaciones;

import com.interfaces.IAdministrador;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class EjecutivoMarketingImpl implements IAdministrador {

    private String opiniones;

    @Pointcut("execution (* com.interfaces.IPublico.darOpiniones(String)) && args(opiniones)")
    public void darOpiniones(String opiniones) {
    }

    @Before("darOpiniones(opiniones)")
    @Override
    public void recibirInformacion(String opiniones) {
        System.out.println("recibiendo opiniones");
        System.out.println("estas son las  opiniones del publico:  " + opiniones);
        this.opiniones = opiniones;

    }

    @Override
    public String getDevolverRespuesta() {
        return this.opiniones;
    }

}
