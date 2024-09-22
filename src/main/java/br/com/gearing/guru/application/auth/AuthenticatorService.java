package br.com.gearing.guru.application.auth;


import br.com.gearing.guru.adapters.inbound.dto.LoginDTO;
import br.com.gearing.guru.adapters.inbound.dto.RegisterDTO;
import br.com.gearing.guru.application.usecases.usercases.UserCases;
import br.com.gearing.guru.domain.model.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticatorService {



    private final UserCases userUseCases;

    @Autowired
    public AuthenticatorService(UserCases userUseCases) {
        this.userUseCases = userUseCases;
    }

    public User registerUser(RegisterDTO dto) {
       return userUseCases.executeRegistration(dto);
    }

    public User loginUser(LoginDTO dto) {
        return userUseCases.authenticate(dto);
    }
}
