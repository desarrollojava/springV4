/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.interfaces.IAdministrador;
import com.interfaces.IPublico;
import com.modular.Modulo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/com/configuracion/applicationContextAopAnt.xml"})
public class TestAopAnotaciones {

    private static Log Logger = LogFactory.getLog(TestAopAnotaciones.class);

//    @Autowired
//    private Modulo modulo;
    
    @Autowired
    private IAdministrador iAdministrador;
    @Autowired
    private IPublico iPublico;

    @Test
    public void test() {
    Logger.info("Inicio de opiniones del publico");
    iPublico.darOpiniones("el marketing esta en las redes sociales");
    assertEquals("el marketing esta en las redes sociales",iAdministrador.getDevolverRespuesta());
    

    }

}
