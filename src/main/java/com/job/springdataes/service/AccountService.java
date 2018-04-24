/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job.springdataes.service;

import com.job.springdataes.dao.elasticsearch.EAccountRepository;
import com.job.springdataes.entity.elasticsearch.EAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
 * Author: Tory
 * Date: 4/24/18
 * Time: 8:49 PM
 */
@Service
public class AccountService {


    @Autowired
    private EAccountRepository eAccountRepository;

    public void save() {
        EAccount eAccount = new EAccount();
        eAccount.setId("1");
        eAccount.setName("zhou");
        eAccountRepository.save(eAccount);
    }

    public void get() {
        Page<EAccount> eAccountWithParams = eAccountRepository.findEAccountWithParams();
        System.out.println(eAccountWithParams.getTotalElements());
    }
}
