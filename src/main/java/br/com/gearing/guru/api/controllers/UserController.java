package br.com.gearing.guru.api.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @PostMapping
    public ResponseEntity<String> includeUser(){

        return  new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public  ResponseEntity<String> retriveUser(){
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
