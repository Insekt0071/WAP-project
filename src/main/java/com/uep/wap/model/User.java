package com.uep.wap.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firts_name;
    private String last_name;
    private String email;

    private String password;
    private Integer role_id;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Player player
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getFirts_name() {
        return firts_name;
    }
    public void setFirts_name(String firts_name) {
        this.firts_name = firts_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name){
        this.last_name = last_name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Integer getRole_id() {
        return role_id;
    }
    public void setRole_id(Integer role_id){
        this.role_id = role_id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }




}