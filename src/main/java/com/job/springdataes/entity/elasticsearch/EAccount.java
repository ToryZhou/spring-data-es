/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job.springdataes.entity.elasticsearch;

import lombok.Data;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Author: Tory
 * Date: 4/24/18
 * Time: 10:33 AM
 */
@Data
@Document(indexName = "account", type = "job")
public class EAccount {
    private String id;
    private String name;

}
