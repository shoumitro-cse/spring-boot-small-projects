/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.service.impl;

import com.javatpoint.model.Account;

/**
 *
 * @author shoumitro
 */
public interface AccountService {

    public abstract Account getAccountByCustomerId(String customerId) throws Exception;
}
