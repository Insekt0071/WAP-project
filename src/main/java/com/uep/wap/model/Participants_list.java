package com.uep.wap.model;

import javax.persistence.*;

@Entity
public class Participants_list {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer player_id;

    @OneToOne
    @JoinColumn(name = "tournament_id")
    private Tournament tournament;

    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Integer getPlayer_id() {
        return player_id;
    }
    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
    }
    public Tournament getTournament() {
        return tournament;
    }
    public void setTournament(Tournament tournament){
        this.tournament = tournament;
    }

}
