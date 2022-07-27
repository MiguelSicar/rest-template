package com.example.testresttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    private final RestTemplate restTemplate;
    @Autowired
    public Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/gato")
    public List<Gato> getGato(){
        String url="https://api.thecatapi.com/v1/images/search";
        List<Gato> lista = restTemplate.getForObject(url,List.class);
        return lista;
        //String urlImagen = lista.get(0).getUrl();
        //return ResponseEntity.status(HttpStatus.FOUND).location(URI.create(urlImagen)).build();
    }

    @GetMapping("/dog")
    public ResponseEntity<Void> getDog(){
        String url="https://dog.ceo/api/breeds/image/random";
        Dog dog = restTemplate.getForObject(url,Dog.class);
        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create(dog.getMessage())).build();
    }

}


