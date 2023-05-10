package com.uep.wap.model;

import javax.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String User_name;
    private String Club_name;
    private Integer Elo;
    private Integer Wins;
    private Integer Loses;
    private Integer Draws;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getUser_name() {
        return User_name;
    }
    public void setUser_name(String User_name) {
        this.User_name = User_name;
    }
    public String getClub_name() {
        return Club_name;
    }
    public void setClub_name(String Club_name){
        this.Club_name = Club_name;
    }
    public Integer getElo() {
        return Elo;
    }
    public void setElo(Integer Elo){
        this.Elo = Elo;
    }
    public Integer getWins() {
        return Wins;
    }
    public void setWins(Integer Wins){
        this.Wins = Wins;
    }
    public Integer getLoses() {
        return Loses;
    }
    public void setLoses(Integer Loses){
        this.Loses = Loses;
    }
    public Integer getDraws() {
        return Draws;
    }
    public void setDraws(Integer Draws){
        this.Draws = Draws;
    }
}
