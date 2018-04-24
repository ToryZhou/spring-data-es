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
//todo check the type and index, 在一个系统里面不能出想两个type？
@Document(indexName = "user", type = "job")
public class EUser {
    private String id;
    private String email;

}
