package com.javatpoint.controller;

import com.javatpoint.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.Employee;
import com.javatpoint.service.BankService;
import com.javatpoint.service.EmployeeService;
import com.javatpoint.service.impl.AccountService;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private BankService bankService;

    @Autowired
    private AccountService accountService;

//    http://localhost:8080/add/employee?empId=203&firstName=shoumitro&secondName=ray
    @RequestMapping(value = "/add/employee", method = RequestMethod.GET)
    public com.javatpoint.model.Employee addEmployee(@RequestParam("empId") String empId, @RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName) {
        // after and before advice
        return employeeService.createEmployee(empId, firstName, secondName);

    }

//    http://localhost:8080/remove/employee?empId=101
    @RequestMapping(value = "/remove/employee", method = RequestMethod.GET)
    public String removeEmployee(@RequestParam("empId") String empId) {

        employeeService.deleteEmployee(empId);

        return "Employee removed(custom message)";
    }

//    http://localhost:8080/bank/balance?num=12345
    @RequestMapping(value = "/bank/balance", method = RequestMethod.GET)
    public String showBalance(@RequestParam("num") String num) {

        // String num = "12345";
        bankService.displayBalance(num); // around advice

        return "Around Advice";
    }

//    http://localhost:8080/service/account?cust_id=K2434567
    @RequestMapping(value = "/service/account", method = RequestMethod.GET)
    public String showAccount(@RequestParam("cust_id") String cust_id) {

        Account account;
        try {
            // After Returning Advice
            account = accountService.getAccountByCustomerId(cust_id);
            if (account != null) {
                System.out.println(account.getAccountNumber() + "\t" + account.getAccountType());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return "After Returning Advice";
    }

    
//    http://localhost:8080/service/account_ex
    @RequestMapping(value = "/service/account_ex", method = RequestMethod.GET)
    public String showAccounts() {
        try {
            // After AfterThrowing Advice
            accountService.getAccountByCustomerId(null);
        } catch (Exception ex) {
            
        }
        return "After AfterThrowing Advice";
    }

}
