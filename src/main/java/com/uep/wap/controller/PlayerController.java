package com.uep.wap.controller;

import com.uep.wap.model.Player;
import com.uep.wap.service.PlayerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping
    public Player createPlayer(@RequestBody Player player) {
        return playerService.savePlayer(player);
    }
    @GetMapping("/get-all")
    public ResponseEntity<List<Player>> getAllPlayers() {
        List<Player> players = playerService.getAllPlayers();
        return new ResponseEntity<>(players, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable Long id, @RequestBody Player playerDetails) {
        Player player = playerService.getPlayer(id);
        if (player == null) {
            return ResponseEntity.notFound().build();
        }
        player.setClubName(playerDetails.getClubName());
        player.setElo(playerDetails.getElo());
        player.setMatchesWon(playerDetails.getMatchesWon());
        player.setMatchesLost(playerDetails.getMatchesLost());
        player.setMatchesDraw(playerDetails.getMatchesDraw());
        Player updatedPlayer = playerService.savePlayer(player);
        return ResponseEntity.ok(updatedPlayer);
    }


}
