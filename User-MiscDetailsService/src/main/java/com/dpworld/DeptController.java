package com.dpworld;

import brave.sampler.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController {


    @Autowired
    RestTemplate restTemplate;

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "/deptRecords")
    public String personelDetails() {
        LOG.info("deptRecords....");
        String deptRecords = "DEPT Name : R&D Department \n DEPT CODE : DP9821832";
        return deptRecords;
    }
}