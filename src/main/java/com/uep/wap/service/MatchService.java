package com.uep.wap.service;

import org.springframework.stereotype.Service;
import com.uep.wap.model.Match;
import com.uep.wap.repository.MatchRepository;

import java.util.List;

@Service
public class MatchService {
    private final MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public Match saveMatch(Match match) {
        return matchRepository.save(match);
    }

    public Match getMatch(Long id) {
        return matchRepository.findById(id).orElse(null);
    }

    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);
    }
}
