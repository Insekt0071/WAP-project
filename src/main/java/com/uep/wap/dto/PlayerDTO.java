package com.uep.wap.dto;

public class PlayerDTO {
    private Long id;
    private String userName;
    private String clubName;
    private int elo;
    private int matchesWon;
    private int matchesLost;
    private int matchesDraw;
    private UserDTO user;
    //getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String user_name) {
        this.userName = user_name;
    }
    public String getClubName() {
        return clubName;
    }
    public void setClubName(String club_name){
        this.clubName = club_name;
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
    public void setMatchesWon(int matches_won){
        this.matchesWon = matches_won;
    }
    public int getMatchesLost() {
        return matchesLost;
    }
    public void setMatchesLost(int matches_lost){
        this.matchesLost = matches_lost;
    }
    public int getMatchesDraw() {
        return matchesDraw;
    }
    public void setMatchesDraw(int matches_draw){
        this.matchesDraw = matches_draw;
    }
    public UserDTO getUser() {
        return user;
    }
    public void setUser(UserDTO user){
        this.user = user;
    }
}
