package br.com.gearing.guru.domain.repositories;

import br.com.gearing.guru.domain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
