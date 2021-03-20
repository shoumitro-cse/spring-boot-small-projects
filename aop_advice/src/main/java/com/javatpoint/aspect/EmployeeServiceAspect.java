package com.javatpoint.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

//    @Before(value = "execution(* com.javatpoint.service.EmployeeService.*(..)) and args(empId, fname, sname)")
    @After(value = "execution(* com.javatpoint.service.EmployeeService.*(..)) and args(empId, fname, sname)")
    public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {
        
        System.out.println("\nBefore method:" + joinPoint.getSignature());

        System.out.println("\n\nCreating Employee: \nfirst name - " + fname + ", \nsecond name - " + sname + " \nid - " + empId);
    }
}
