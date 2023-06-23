package com.uep.wap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.uep.wap.model.Tournament;
import com.uep.wap.service.TournamentService;

import java.util.List;

@RestController
@RequestMapping("/tournaments")
public class TournamentController {
    private final TournamentService tournamentService;

    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    @PostMapping
    public Tournament createTournament(@RequestBody Tournament tournament) {
        return tournamentService.saveTournament(tournament);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tournament> getTournament(@PathVariable Long id) {
        Tournament tournament = tournamentService.getTournament(id);
        if (tournament == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tournament);
    }

    @GetMapping
    public ResponseEntity<List<Tournament>> getAllTournaments() {
        List<Tournament> tournaments = tournamentService.getAllTournaments();
        return ResponseEntity.ok(tournaments);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tournament> updateTournament(@PathVariable Long id, @RequestBody Tournament tournamentDetails) {
        Tournament tournament = tournamentService.getTournament(id);
        if (tournament == null) {
            return ResponseEntity.notFound().build();
        }
        tournament.setName(tournamentDetails.getName());
        tournament.setCity(tournamentDetails.getCity());
        tournament.setCountry(tournamentDetails.getCountry());
        tournament.setStartDate(tournamentDetails.getStartDate());
        tournament.setFinishDate(tournamentDetails.getFinishDate());
        tournament.setMaxPlayers(tournamentDetails.getMaxPlayers());
        tournament.setMinPlayers(tournamentDetails.getMinPlayers());
        tournament.setGameAdminId(tournamentDetails.getGameAdminId());
        Tournament updatedTournament = tournamentService.saveTournament(tournament);
        return ResponseEntity.ok(updatedTournament);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTournament(@PathVariable Long id) {
        tournamentService.deleteTournament(id);
        return ResponseEntity.noContent().build();
    }

}
