package com.start.learningspring.login.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class User {
    @Id
    String username;
    String Password;
    String name;
}
