/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.model;

/**
 *
 * @author shoumitro
 */
public class Account {

    private String accountNumber;
    private String accountType;

    public Account(String accountNumber, String accountType) {
        super();
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + "]";
    }
}
