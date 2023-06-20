package com.uep.wap.model;

import javax.persistence.*;


@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Alg_notation;

    @ManyToOne
    @JoinColumn(name = "tournament_id")
    private Tournament tournament;

    @ManyToOne
    @JoinColumn(name = "player1_id")
    private Player player1;

    @ManyToOne
    @JoinColumn(name = "player2_id")
    private Player player2;
    //getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Tournament getTournament() {
        return tournament;
    }
    public void setTournament(Tournament tournament){
        this.tournament = tournament;
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
    public String getAlg_notation() {
        return Alg_notation;
    }
    public void setAlg_notation(String Alg_notation){
        this.Alg_notation = Alg_notation;
    }

}
