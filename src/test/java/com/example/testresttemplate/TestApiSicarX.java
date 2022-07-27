package com.example.testresttemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

public class TestApiSicarX {
    BodyObject bodyObject = new BodyObject("67254e71-6506-493f-af6c-5a47185a79ae", "miguel.camacho@sicar.mx", "Miguel", "Camacho", "52", "3171059708", "7251dcde6729a7ada936c104e683608fae9af262ec4883605ee4ca90f95951b471a441d4e3ed211a1aa1513df95db2e42b23ef388b290336daff8be25ae1d105", "México", "1", "1", "1", "1", "1");
    final String urlApi = "https://api.sicarx.com/account/v1/account";
    final TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void uuidAlfabeticos() {
        BodyObject bodyTest = bodyObject;
        bodyTest.setUuid("quioopotyuajbhlkgg,nvbch");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type","application/json");
        ResponseEntity<ResponsePrueba> response = restTemplate.exchange(urlApi, HttpMethod.POST, new HttpEntity<>(bodyTest,httpHeaders), ResponsePrueba.class);

        Assertions.assertEquals(5, response.getBody().getCode());
        //Assertions.assertEquals("Account uuid with value quioopotyuajbhlkgg,nvbch is not a valid UUID",response.getMessage());

    }

    @Test
    public void uuidNumericos() {
        BodyObject bodyTest = bodyObject;
        bodyTest.setUuid("45675612222312");
        try {
            ResponsePrueba response = restTemplate.postForObject(urlApi, bodyTest, ResponsePrueba.class);
            Assertions.assertEquals(5, response.getCode());
            Assertions.assertEquals("Account uuid with value 45675612222312 is not a valid UUID", response.getMessage());
        } catch (Exception exception) {
        }
    }

    @Test
    public void uuidCaracteresEspeciales() {
        BodyObject bodyTest = bodyObject;
        bodyTest.setUuid("%^~~!!!@#&:;@%./");

        //ResponsePrueba responsetry = restTemplate.postForObject(urlApi,bodyTest,ResponsePrueba.class);
        //ResponseEntity<ResponsePrueba> response = restTemplate.postForEntity(urlApi,bodyTest,ResponsePrueba.class);


        //Assertions.assertEquals(5,responsetry.getCode());
        //Assertions.assertEquals("Account uuid with value %^~~!!!@#&:;@%./ is not a valid UUID",responsetry.getMessage());

    }


}
