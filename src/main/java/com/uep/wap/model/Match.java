package com.uep.wap.model;

import javax.persistence.*;
@Entity
public class Match  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="player1_id", nullable=false)
    private Player player1;
    @ManyToOne
    @JoinColumn(name="player2_id", nullable=false)
    private Player player2;
    private String algerbaicNotation;
    private Long arbiterId;

    @ManyToOne
    @JoinColumn(name="tournament_id", nullable=false)
    private Tournament tournament;
    //getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Player getPlayer1() {
        return player1;
    }
    public void setPlayer1(Player player1){
        this.player1 = player1;
    }
    public Player getPlayer2() {
        return player2;
    }
    public void setPlayer2(Player player2){
        this.player2 = player2;
    }
    public String getAlgerbaicNotation() {
        return algerbaicNotation;
    }
    public void setAlgerbaicNotation(String algerbaicNotation){
        this.algerbaicNotation = algerbaicNotation;
    }
    public Long getArbiterId() {
        return arbiterId;
    }
    public void setArbiterId(Long arbiterId){
        this.arbiterId = arbiterId;
    }
    public Tournament getTournament() {
        return tournament;
    }
    public void setTournament(Tournament tournament){
        this.tournament = tournament;
    }


}
