package br.com.gearing.guru.adapters.repository;


import br.com.gearing.guru.domain.model.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {

    Optional<User> findByEmail(String email);

}
