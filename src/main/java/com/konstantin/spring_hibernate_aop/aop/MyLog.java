/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.spring_hibernate_aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 *
 * @author JavaDev
 */
@Aspect
@Component
public class MyLog {
    @Around("execution(* com.konstantin.spring_hibernate_aop.DAO.EmployeeDAO.*(..))")
    public Object aroundRepMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        MethodSignature signature = (MethodSignature)proceedingJoinPoint.getSignature();
        String name = signature.getName();
        System.out.println("||||||||||||||||||||");
        System.out.println("begin of + "+ name);
        
        Object proceed = proceedingJoinPoint.proceed();
        
        System.out.println("end of + "+ name);
        return proceed;
        
    }
    
}
