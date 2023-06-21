package com.uep.wap.model;
import java.util.*;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;
    private String country;
    private Date startDate;
    private Date finishDate;
    private int maxPlayers;
    private int minPlayers;
    private Long gameAdminId;
    @OneToMany(mappedBy = "tournament", cascade = CascadeType.ALL)
    private Set<TournamentPlayer> tournamentPlayers;
    @OneToMany(mappedBy = "tournament", cascade = CascadeType.ALL)
    private Set<Match> matches;

    public Set<Match> getMatches() {
        return matches;
    }
    public void setMatches(Set<Match> matches){
        this.matches = matches;
    }

    //getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
public String getCity() {
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
public String getCountry() {
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }
public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }
public Date getFinishDate() {
        return finishDate;
    }
    public void setFinishDate(Date finishDate){
        this.finishDate = finishDate;
    }
public int getMaxPlayers() {
        return maxPlayers;
    }
    public void setMaxPlayers(int maxPlayers){
        this.maxPlayers = maxPlayers;
    }
public int getMinPlayers() {
        return minPlayers;
    }
    public void setMinPlayers(int minPlayers){
        this.minPlayers = minPlayers;
    }
public Long getGameAdminId() {
        return gameAdminId;
    }
    public void setGameAdminId(Long gameAdminId){
        this.gameAdminId = gameAdminId;
    }
public Set<TournamentPlayer> getTournamentPlayers() {
        return tournamentPlayers;
    }
    public void setTournamentPlayers(Set<TournamentPlayer> tournamentPlayers){
        this.tournamentPlayers = tournamentPlayers;
    }





}
