package com.uep.wap.model;

import javax.persistence.*;

    @Entity
    public class TournamentPlayer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "player_id", referencedColumnName = "id")
        private Player player;

        @ManyToOne
        @JoinColumn(name = "tournament_id", referencedColumnName = "id")
        private Tournament tournament;

        //getters and setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Player getPlayer() {
            return player;
        }

        public void setPlayer(Player player) {
            this.player = player;
        }

        public Tournament getTournament() {
            return tournament;
        }

        public void setTournament(Tournament tournament) {
            this.tournament = tournament;
        }

    }

