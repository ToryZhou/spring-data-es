/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.job.springdataes.controller;

import com.job.springdataes.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Tory
 * Date: 4/24/18
 * Time: 10:42 AM
 */
@RequestMapping("account")
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<?> save() {
        accountService.save();
        return ResponseEntity.ok("success");
    }

    @GetMapping
    public ResponseEntity<?> get() {
        accountService.get();
        return ResponseEntity.ok("success");
    }
}
