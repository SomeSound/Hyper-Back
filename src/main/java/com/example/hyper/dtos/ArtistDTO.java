package com.example.hyper.dtos;

import com.example.hyper.entities.BaseEntity;
import lombok.Data;
import javax.validation.constraints.NotEmpty;

@Data
public class ArtistDTO {

    private Long id;

    @NotEmpty(message = "Invalid name, can not be empty" )
    private String name;

    @NotEmpty(message = "Invalid country, can not be empty")
    private String country;

    @NotEmpty(message = "Invalid username, can not be empty")
    private String username;

    @NotEmpty(message = "Invalid password, can not be empty")
    private String password;

    @NotEmpty(message = "Invalid email, can not be empty")
    private String email;
}
