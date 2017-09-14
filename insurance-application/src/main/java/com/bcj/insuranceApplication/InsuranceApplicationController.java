package com.bcj.insuranceApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@RestController
public class InsuranceApplicationController {
	@Autowired
    RestTemplate restTemplate;
 
    @RequestMapping(method = RequestMethod.GET)
    public String getStudents(@PathVariable String schoolname)
    {
       // System.out.println("Getting School details for " + schoolname);
 
        String response = restTemplate.exchange("http://Customer-Server:8098",
                                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}).getBody();
 
        System.out.println("Response Received as " + response);
 
        return   response;
    }
 
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}