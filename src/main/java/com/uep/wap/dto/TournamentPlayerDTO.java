package com.uep.wap.dto;

public class TournamentPlayerDTO {
    private Long id;
    private PlayerDTO player;
    private TournamentDTO tournament;

    //getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public PlayerDTO getPlayer() {
        return player;
    }
    public void setPlayer(PlayerDTO player){
        this.player = player;
    }
    public TournamentDTO getTournament() {
        return tournament;
    }
    public void setTournament(TournamentDTO tournament){
        this.tournament = tournament;
    }
}
