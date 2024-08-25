package br.com.gearing.guru.api.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cars")
public class CarController {


    @GetMapping("/list")
    public ResponseEntity<String> listCars() {
        return new ResponseEntity<>(HttpStatus.OK);

    }


}
