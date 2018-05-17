/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.implementaciones.Profesor;
import com.interfaces.IInstructor;
import com.modular.Modulo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/com/configuracion/applicationContext.xml"})
public class TestProfesor {

    private static Log Logger = LogFactory.getLog(TestProfesor.class);

    @Autowired
    @Qualifier("modulo")
    private Modulo modulo;

    @Test
//    @Ignore
    public void testprofesor() {
//        modulo.idBeanInvestigador.ejecutar();
        modulo.idBeanProfesor.enviarCorreos();
        
//        System.out.println("fin de ejecutar");
//        
//        modulo.idBeanInvestigador.ejecutar();
        
//        Logger.info("Inicio de enseñar matematica");
//        int asignaturas = 8;
//        profesorMatematica.ejecutar();
//        assertEquals(asignaturas, ((Profesor) profesorMatematica).getNumeroAsignaturas());
//        Logger.info("Fin de enseñar");

    }
    
    

}
