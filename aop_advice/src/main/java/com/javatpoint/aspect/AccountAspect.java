/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import com.javatpoint.model.Account;
import org.aspectj.lang.annotation.AfterThrowing;

/**
 *
 * @author shoumitro
 */
@Aspect
@Component
public class AccountAspect {
//implementing after returning advice     

    @AfterReturning(value = "execution(* com.javatpoint.service.impl.AccountServiceImpl.*(..))", returning = "account")
    public void afterReturningAdvice(JoinPoint joinPoint, Account account) {
        System.out.println("\n\nAfter Returing method:" + joinPoint.getSignature());
        System.out.println("From account toString Method: " + account);
    }

    //implementing after throwing advice      
    @AfterThrowing(value = "execution(* com.javatpoint.service.impl.AccountServiceImpl.*(..))", throwing = "ex")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex) {
        System.out.println("\n\nAfter Throwing exception in method:" + joinPoint.getSignature());
        System.out.println("Exception is:" + ex.getMessage());
    }

}
