package br.com.gearing.guru.application.commands;

import br.com.gearing.guru.api.models.UserModel;
import br.com.gearing.guru.domain.repositories.UserRepository;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserCommands {

    @Autowired
    UserRepository repository;

    public void includeUser(UserModel user) {


        try {

            repository.save(user.mapToEntity());
        } catch (Exception e) {
            //TODO: colocar uma implemetação de log aqui

        }

    }

}
