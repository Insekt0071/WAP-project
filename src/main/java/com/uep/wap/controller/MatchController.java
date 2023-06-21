package com.uep.wap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.uep.wap.model.Match;
import com.uep.wap.service.MatchService;

@RestController
@RequestMapping("/matches")
public class MatchController {
    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @PostMapping
    public Match createMatch(@RequestBody Match match) {
        return matchService.saveMatch(match);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Match> updateMatch(@PathVariable Long id, @RequestBody Match matchDetails) {
        Match match = matchService.getMatch(id);
        if (match == null) {
            return ResponseEntity.notFound().build();
        }
        match.setAlg_notation(matchDetails.getAlg_notation());
        match.setPlayer1(matchDetails.getPlayer1());
        match.setPlayer2(matchDetails.getPlayer2());
        match.setTournament(matchDetails.getTournament());
        Match updatedMatch = matchService.saveMatch(match);
        return ResponseEntity.ok(updatedMatch);
    }

    // Add other endpoints as needed...
}

