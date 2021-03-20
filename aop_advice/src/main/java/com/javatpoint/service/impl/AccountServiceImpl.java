/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Account;

/**
 *
 * @author shoumitro
 */
@Service
public class AccountServiceImpl implements AccountService {
//storing account detail in the HashMap  

    private static Map<String, Account> map = null;

    static {
        map = new HashMap<>();
        //adding account detail in the map  
        map.put("M4546779", new Account("10441117000", "SavingAccountB"));
        map.put("K2434567", new Account("10863554577", "CurrentAccountB"));
    }

    @Override
    public Account getAccountByCustomerId(String customerId) throws Exception {

        if (customerId == null) {
            throw new Exception("Invalid! Customer Id");
        }

        Account account = null;
        Set<Entry<String, Account>> entrySet = map.entrySet();

        for (Entry<String, Account> entry : entrySet) {
            if (entry.getKey().equals(customerId)) {
                account = entry.getValue();
            }
        }

        return account;
    }
}
