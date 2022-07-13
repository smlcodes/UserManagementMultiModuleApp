package com.dpworld;

import brave.sampler.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class MiscController {


        @Autowired
        RestTemplate restTemplate;

        @Bean
        public RestTemplate getRestTemplate() {
            return new RestTemplate();
        }

        @Bean
        public Sampler defaultSampler() {
            return Sampler.ALWAYS_SAMPLE;
        }

        private final Logger LOG = LoggerFactory.getLogger(this.getClass());

        @GetMapping(value = "/miscDetails")
        public String miscDetails() {
            LOG.info("miscDetails....");


            String baseUrl = "http://localhost:8084/healthRecords";
            String healthRecords = (String) restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class).getBody();

            baseUrl = "http://localhost:8084/salaryRecords";
            String salaryRecords = (String) restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class).getBody();

            baseUrl = "http://localhost:8084/deptRecords";
            String deptRecords = (String) restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class).getBody();


            return healthRecords+" \n "+salaryRecords+" \n "+deptRecords;
        }
    }