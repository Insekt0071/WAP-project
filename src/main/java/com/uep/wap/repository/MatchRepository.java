package com.uep.wap.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uep.wap.model.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
}


