package com.wnergy.smartMr.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "USER")
@Getter
public class User {

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_pw", length = 50, nullable = false)
    private String userPw;

    @Column(name = "user_name", length = 50, nullable = false)
    private String userName;

    @Column(name = "user_email", length = 100, nullable = false)
    private String userEmail;

    @Column(name = "user_gender", length = 1)
    private String userGender;

}

