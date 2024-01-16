package com.login.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Registration")
public class Registration {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column(name = "username",nullable = false)
        private String username;
        @Column(name = "password",nullable = false)
        private String password;
        @Column(name = "email",nullable = false)
        private String email;
}
