package com.uep.wap.dto;

public class MatchDTO {
    private Long id;
    private PlayerDTO player1;
    private PlayerDTO player2;
    private String algebraicNotation;
    private Long arbiterId;

    //getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public PlayerDTO getPlayer1() {
        return player1;
    }
    public void setPlayer1(PlayerDTO player1){
        this.player1 = player1;
    }
    public PlayerDTO getPlayer2() {
        return player2;
    }
    public void setPlayer2(PlayerDTO player2){
        this.player2 = player2;
    }
    public String getAlgebraicNotation() {
        return algebraicNotation;
    }
    public void setAlgebraicNotation(String algebraicNotation){
        this.algebraicNotation = algebraicNotation;
    }
    public Long getArbiterId() {
        return arbiterId;
    }
    public void setArbiterId(Long arbiterId){
        this.arbiterId = arbiterId;
    }
}
