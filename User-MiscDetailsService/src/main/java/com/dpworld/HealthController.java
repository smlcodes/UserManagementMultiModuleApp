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
public class HealthController {


    @Autowired
    RestTemplate restTemplate;


    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "/healthRecords")
    public String healthRecords() {
        LOG.info("healthRecords....");

        String healthRecords = "Blood Group: AB+ \n Height : 5'8 \n Weight: 60KG";

        return healthRecords;
    }
}