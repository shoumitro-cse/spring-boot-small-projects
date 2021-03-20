package com.javatpoint;

import com.javatpoint.model.Account;
import com.javatpoint.service.BankService;
import com.javatpoint.service.impl.AccountService;
import com.javatpoint.service.impl.AccountServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopAdviceExampleApplication {

    public static void main(String[] args) {

        SpringApplication.run(AopAdviceExampleApplication.class, args);

//        ConfigurableApplicationContext context = SpringApplication.run(AopAdviceExampleApplication.class, args);
//
//        // Fetching the employee object from the application context.  
//        BankService bank = context.getBean(BankService.class);
//        
//        // Displaying balance in the account  
//        String accnumber = "12345";
//        bank.displayBalance(accnumber);
//        
//        // Closing the context object  
//        context.close();


//        ConfigurableApplicationContext ac = SpringApplication.run(AopAdviceExampleApplication.class, args);
//        //Fetching the account object from the application context  
//        AccountService accountService = ac.getBean("accountServiceImpl", AccountServiceImpl.class);
//        Account account;
//        try {
//            account = accountService.getAccountByCustomerId("K2434567");
//            if (account != null) {
//                System.out.println(account.getAccountNumber() + "\t" + account.getAccountType());
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        
        
    }
}

