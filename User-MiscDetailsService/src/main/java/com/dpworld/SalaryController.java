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
public class SalaryController {


    @Autowired
    RestTemplate restTemplate;


    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "/salaryRecords")
    public String salaryRecords() {
        LOG.info("salaryRecords....");
        String salaryRecords = "Acc No : 2378832672763 \n Salary : 58940";
        return salaryRecords;
    }
}