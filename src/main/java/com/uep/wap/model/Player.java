package com.uep.wap.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clubName;
    private int elo;
    private int matchesWon;
    private int matchesLost;
    private int matchesDraw;

    @ManyToOne
    @JoinColumn(name = "match_id", referencedColumnName = "id")
    private Match match;
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "player")
    private Set<TournamentPlayer> tournamentPlayers;

    //getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getClubName() {
        return clubName;
    }
    public void setClubName(String clubName){
        this.clubName = clubName;
    }
    public int getElo() {
        return elo;
    }
    public void setElo(int elo){
        this.elo = elo;
    }
    public int getMatchesWon() {
        return matchesWon;
    }
    public void setMatchesWon(int matchesWon){
        this.matchesWon = matchesWon;
    }
    public int getMatchesLost() {
        return matchesLost;
    }
    public void setMatchesLost(int matchesLost){
        this.matchesLost = matchesLost;
    }
    public int getMatchesDraw() {
        return matchesDraw;
    }
    public void setMatchesDraw(int matchesDraw){
        this.matchesDraw = matchesDraw;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }
    public Set<TournamentPlayer> getTournamentPlayers() {
        return tournamentPlayers;
    }
    public void setTournamentPlayers(Set<TournamentPlayer> tournamentPlayers){
        this.tournamentPlayers = tournamentPlayers;
    }
}
