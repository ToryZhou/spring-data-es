package com.job.springdataes.dao.elasticsearch.custom;

import com.job.springdataes.entity.elasticsearch.EAccount;

import org.springframework.data.domain.Page;

/**
 * Author: Tory
 * Date: 12/20/17
 * Time: 10:17 AM
 */
public interface EAccountRepositoryCustom {

    Page<EAccount> findEAccountWithParams();

}
