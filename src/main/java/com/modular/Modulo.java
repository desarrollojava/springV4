/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modular;

import com.interfaces.IInstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class Modulo {

    @Autowired
    @Qualifier("idBeanInvestigador")
    public IInstructor idBeanInvestigador;

    @Autowired
    @Qualifier("idBeanProfesor")
    public IInstructor idBeanProfesor;

    public Modulo() {
    }

}
