/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author shoumitro
 */
@Service
public class BankService {

    public void displayBalance(String accNum) {
        System.out.println("\nInside displayBalance() method");
        if (accNum.equals("12345")) {
            System.out.println("Total balance: 10,000");
        } else {
            System.out.println("Sorry! wrong account number.");
        }
    }
}
