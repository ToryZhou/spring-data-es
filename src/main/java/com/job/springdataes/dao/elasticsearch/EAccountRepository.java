package com.job.springdataes.dao.elasticsearch;

import com.job.springdataes.dao.elasticsearch.custom.EAccountRepositoryCustom;
import com.job.springdataes.entity.elasticsearch.EAccount;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

/**
 * Author: Tory
 * Date: 12/20/17
 * Time: 10:17 AM
 */
public interface EAccountRepository extends ElasticsearchCrudRepository<EAccount, String>, EAccountRepositoryCustom {


}
