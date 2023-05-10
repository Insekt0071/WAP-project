package com.uep.wap.model;

import javax.persistence.*;
import java.time.DateTimeException;
import java.util.Date;

@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String city;
    private String country;
    private Date start_date;
    private Date end_date;
    private Integer max_players;
    private Integer min_players;
    private Integer plist_id;
    private Integer game_admin_id;

    @OneToOne(mappedBy = "tournament", cascade = CascadeType.ALL)
    private Participants_list participants_list;

    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
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
    public Date getStart_date() {
        return start_date;
    }
    public void setStart_date(Date start_date){
        this.start_date = start_date;
    }
    public Date getEnd_date() {
        return end_date;
    }
    public void setEnd_date(Date end_date){
        this.end_date = end_date;
    }
    public Integer getMax_players() {
        return max_players;
    }
    public void setMax_players(Integer max_players){
        this.max_players = max_players;
    }
    public Integer getMin_players() {
        return min_players;
    }
    public void setMin_players(Integer min_players){
        this.min_players = min_players;
    }
    public Integer getPlist_id() {
        return plist_id;
    }
    public void setPlist_id(Integer plist_id){
        this.plist_id = plist_id;
    }
    public Integer getGame_admin_id() {
        return game_admin_id;
    }
    public void setGame_admin_id(Integer game_admin_id){
        this.game_admin_id = game_admin_id;
    }
    public Participants_list getParticipants_list() {
        return participants_list;
    }
    public void setParticipants_list(Participants_list participants_list){
        this.participants_list = participants_list;
    }




}
