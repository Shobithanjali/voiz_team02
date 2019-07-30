package com.example.voiz_team02.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/*import org.springframework.data.annotation.Id;

import javax.persistence.Entity;*/
import javax.validation.constraints.*;

@Data
@Document
/*@Entity*/
public class Register {

    @Id
    private String id;
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z\\s]{2,20}$",message = "Give a valid name")
    private  String full_name;

    @NotBlank
    @Digits(integer=10,message="Invalid no", fraction = 0)
    private String mobile_no;
    @NotBlank
   /* @Pattern(regexp = "^(.+)@(.+)$",message = "invalid id")*/
    @Email
    private String email_address;
    @NotBlank
    @Size(min = 6,message = "minimum 6 characters")
    private String password;



}
