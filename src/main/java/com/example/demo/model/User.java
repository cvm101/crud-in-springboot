package com.example.demo.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "`user`")
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  Long id;

    private  String name;
    private  String email;

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @NotBlank(message = "name is necessary")
    public String getName() {
        return name;
    }

    @NotBlank(message = "Email is necessary")
    @Email(message = "email validator")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
