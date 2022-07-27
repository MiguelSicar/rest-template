package com.example.testresttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private final RestTemplate restTemplate;
    @Autowired
    public Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/gato")
    public Object getGato(){
        String url="https://api.thecatapi.com/v1/images/search";

        Object object = restTemplate.getForObject(url,Object.class);
        return object;
    }
}
