package com.example.Dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "admindetails")
public class AdminDetails implements Serializable {

    @Id
    @GeneratedValue
    private String adminId;
    @Column(name = "userId")
    private String userId;
    @Column(name = "password")
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
