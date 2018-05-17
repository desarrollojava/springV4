/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Repository;

@Repository
public class Estudiante {

    public void sentarse() {
        System.out.println("las clases estan por comenzar, sentarse");
    }

    public void apagarcelulares() {
        System.out.println("se han apagado los celulares");

    }

    public void realizarPreguntas() {
        System.out.println("la clase termino, realizar preguntas");

    }

    public void salirDelAula() {
        System.out.println("salir del aula");

    }

    public void monitorearClasesMatematica(ProceedingJoinPoint jointPoint) {
        try {
            System.out.println("las clases estan por comenzar, sentarse");
            System.out.println("se han apagado los celulares");
            long horaInicio = System.currentTimeMillis();//hora de inicio
            jointPoint.proceed();//llama a ejecutar
            Thread.sleep(1000);

            System.out.println("la clase termino, realizar preguntas");
            long horaTermino = System.currentTimeMillis();
            System.out.println("la clase duraron::--> "+(horaTermino-horaInicio));

        } catch (Throwable t) {
            System.out.println("salir del aula"+t.getMessage());
        }
    }

}
