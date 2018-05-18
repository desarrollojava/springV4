/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aop.anotaciones;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class ClaseAspecto {
    @Pointcut("execution(* com.implementaciones.Profesor.enviarC*(..))" +
            "|| execution(* com.implementaciones.Profesor.ejecutar(..))")
//    @Pointcut("execution(* com.implementaciones.Profesor.ejecutar(..))")
    public void ejecutarImpartirClases(){
    }
    
    
    
    @Around("ejecutarImpartirClases()")
    public void monitorearClasesMatematica(ProceedingJoinPoint jointPoint) {
        try {
            System.out.println("las clases estan por comenzar, sentarse");
            System.out.println("se han apagado los celulares");
            long horaInicio = System.currentTimeMillis();//hora de inicio
            jointPoint.proceed();//llama a ejecutar
            Thread.sleep(1000);

            System.out.println("la clase termino, realizar preguntas");
            long horaTermino = System.currentTimeMillis();
            System.out.println("la clase duraron::--> " + (horaTermino - horaInicio));

        } catch (Throwable t) {
            System.out.println("salir del aula" + t.getMessage());
        }
    }

}
