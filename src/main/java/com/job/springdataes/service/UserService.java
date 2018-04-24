/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job.springdataes.service;

import com.job.springdataes.dao.elasticsearch.EUserRepository;
import com.job.springdataes.entity.elasticsearch.EUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: Tory
 * Date: 4/24/18
 * Time: 10:42 AM
 */
@Service
public class UserService {

    @Autowired
    private EUserRepository eUserRespository;

    public void save() {
        EUser eUser = new EUser();
        eUser.setId("a");
        eUser.setEmail("testaa@patsnap.com");
        eUserRespository.save(eUser);
    }
}
