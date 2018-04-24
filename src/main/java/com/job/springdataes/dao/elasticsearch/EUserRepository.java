package com.job.springdataes.dao.elasticsearch;

import com.job.springdataes.entity.elasticsearch.EUser;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

/**
 * Author: Tory
 * Date: 12/20/17
 * Time: 10:17 AM
 */
public interface EUserRepository extends ElasticsearchCrudRepository<EUser, String> {


}
