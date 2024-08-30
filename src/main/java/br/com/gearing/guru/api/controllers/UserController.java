package br.com.gearing.guru.api.controllers;


import br.com.gearing.guru.api.models.UserModel;
import br.com.gearing.guru.application.commands.UserCommands;
import br.com.gearing.guru.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    UserCommands userCommands;

    @PostMapping
    public ResponseEntity<String> includeUser(@RequestBody UserModel usermodel) {
        //TODO: Colocar a implementação de criptografia de senha
        userCommands.includeUser(usermodel);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<String> retriveUser() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
