package br.com.gearing.guru.api.models;


import br.com.gearing.guru.domain.entities.UserEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserModel {

    private Long id;

    private String userName;

    private String email;

    private String password;

    public UserModel(Long id, String userName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }


    public UserEntity mapToEntity() {
        return new UserEntity(userName, email,password);

    }
}
