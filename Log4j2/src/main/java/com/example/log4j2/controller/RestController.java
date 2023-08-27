package com.example.log4j2.controller;

import com.example.log4j2.Service.Service;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@org.springframework.web.bind.annotation.RestController
@Log4j2
public class RestController {
    @Autowired
    Service service;

    @GetMapping("/log")
    public void noClearThreadLog(){

        service.logService();

        log.info("Get uuid từ threadContext của Log4j2: "+ThreadContext.get("uuid"));
    }

}
