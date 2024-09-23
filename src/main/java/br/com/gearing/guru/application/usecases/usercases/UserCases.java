package br.com.gearing.guru.application.usecases.usercases;

import br.com.gearing.guru.adapters.input.dto.LoginDTO;
import br.com.gearing.guru.adapters.input.dto.RegisterDTO;
import br.com.gearing.guru.adapters.repository.UserRepository;
import br.com.gearing.guru.domain.model.users.User;
import br.com.gearing.guru.infrastructure.jwt.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserCases {

    @Autowired
    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;

    @Autowired
    private final JwtUtil jwtUtil;


    public UserCases(UserRepository userRepository, PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }

    public User executeRegistration(RegisterDTO registerUser) {
        User user = new User();
        user.setFullName(registerUser.getFullName());
        user.setPassword(passwordEncoder.encode(registerUser.getPassword()));
        user.setEmail(registerUser.getEmail());
        return userRepository.save(user);
    }

    public User authenticate(LoginDTO input) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(input.getEmail(), input.getPassword()));
        return userRepository.findByEmail(input.getEmail())
                .orElseThrow();

    }

    public String generateToken(User user) {
        return jwtUtil.generateToken(user);
    }

}


