package com.uep.wap.repository;
import com.uep.wap.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Integer> {
    // You can add custom query methods here if needed
}

