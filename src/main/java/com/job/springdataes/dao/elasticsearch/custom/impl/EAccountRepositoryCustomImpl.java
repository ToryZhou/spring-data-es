package com.job.springdataes.dao.elasticsearch.custom.impl;


import com.job.springdataes.dao.elasticsearch.custom.EAccountRepositoryCustom;
import com.job.springdataes.entity.elasticsearch.EAccount;

import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;

/**
 * Author: Tory
 * Date: 12/20/17
 * Time: 10:17 AM
 */
public class EAccountRepositoryCustomImpl implements EAccountRepositoryCustom {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;


    @Override
    public Page<EAccount> findEAccountWithParams() {

        // 全匹配
        MatchQueryBuilder email = QueryBuilders.matchQuery("name", "zho");
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(email)
                .build();
        return elasticsearchTemplate.queryForPage(searchQuery, EAccount.class);
    }
}
