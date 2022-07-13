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
public class PersonelController {


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

        @GetMapping(value = "/personelDetails")
        public String personelDetails() {
            LOG.info("personelDetails....");
            String personelDetails = "Name : AAA \n Age : 30";

            String baseUrl = "http://localhost:8084/miscDetails";
            String response = (String) restTemplate.exchange(baseUrl, HttpMethod.GET, null, String.class).getBody();

            return personelDetails+" \n "+response;
        }
    }