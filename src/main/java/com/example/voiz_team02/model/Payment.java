package com.example.demo1.model;


import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Data
@Document
public class Payment {
@Id
    private String id;
    @NotBlank(message="Name is required")
    @Size(min = 5,message = "Atleast 5 characters")
    @Pattern(regexp="[A-Za-z]*", message = "enter valid name")
    private String owner;
    @NotBlank
    @Digits(integer=3,message="Invalid no", fraction = 0)
    private String cvv;
    @NotBlank
    @CreditCardNumber(message="Not a valid credit card number")
    private String cardno;
}
