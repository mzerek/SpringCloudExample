package com.mzerek.service.two.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class ServiceTwoRestController {

    private final DiscoveryClient discoveryClient;
    private final RestClient restClient;

    public ServiceTwoRestController(DiscoveryClient discoveryClient, RestClient.Builder restClientBuilder) {
        this.discoveryClient = discoveryClient;
        this.restClient = restClientBuilder.build();
    }

    @GetMapping("/helloEureka")
    public String helloEureka(){
        ServiceInstance serviceInstance = discoveryClient.getInstances("serviceone").get(0);
        String serviceOneResponse = restClient.get()
                .uri(serviceInstance.getUri() + "/helloOne")
                .retrieve()
                .body(String.class);

        return serviceOneResponse;
    }
}
