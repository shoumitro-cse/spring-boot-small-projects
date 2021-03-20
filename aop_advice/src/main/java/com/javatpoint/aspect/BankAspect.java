/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author shoumitro
 */
//Enables the spring AOP functionality in an application  
@Aspect
@Component
public class BankAspect {
//Displays all the available methods i.e. the advice will be called for all the methods  

    @Pointcut(value = "execution(* com.javatpoint.service.BankService.*(..))")
    private void logDisplayingBalance() {
    }


    // Declares the around advice that is applied before and after the method matching with a pointcut expression  
    @Around(value = "logDisplayingBalance()")
    public void aroundAdvice(ProceedingJoinPoint jp) throws Throwable {
        
        System.out.println("\n\n\nThe method aroundAdvice() before invokation of the method " + jp.getSignature().getName() + " method");
        
        try {
            jp.proceed();
        } catch(Exception e) {
            
        } finally {

        }
        
        System.out.println("\nThe method aroundAdvice() after invokation of the method " + jp.getSignature().getName() + " method\n\n");
    }
}
