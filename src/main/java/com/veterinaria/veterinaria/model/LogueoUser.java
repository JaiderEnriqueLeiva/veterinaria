package com.veterinaria.veterinaria.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LogueoUser {

    @Id
    @GeneratedValue
    private int id;

    private String email;

    private String password;


}
