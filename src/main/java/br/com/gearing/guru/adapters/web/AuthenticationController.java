package br.com.gearing.guru.adapters.web;


import br.com.gearing.guru.adapters.inbound.dto.LoginDTO;
import br.com.gearing.guru.adapters.inbound.dto.RegisterDTO;
import br.com.gearing.guru.application.auth.AuthenticatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class AuthenticationController {

    private final AuthenticatorService authenticationService;

    @Autowired
    public AuthenticationController(AuthenticatorService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegisterDTO  registerUserDto) {
        authenticationService.registerUser(registerUserDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginDTO loginDto) {
       // String token = authenticationService.loginUser(loginDto);
        //return ResponseEntity.ok(token);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
