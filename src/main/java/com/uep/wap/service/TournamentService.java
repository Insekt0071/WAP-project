package com.uep.wap.service;

import org.springframework.stereotype.Service;
import com.uep.wap.model.Tournament;
import com.uep.wap.repository.TournamentRepository;

import java.util.List;

@Service
public class TournamentService {
    private final TournamentRepository tournamentRepository;

    public TournamentService(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

    public Tournament saveTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    public Tournament getTournament(Long id) {
        return tournamentRepository.findById(id).orElse(null);
    }

    public List<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    public void deleteTournament(Long id) {
        tournamentRepository.deleteById(id);
    }
}
