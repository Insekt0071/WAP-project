package com.uep.wap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uep.wap.model.Tournament;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Long> {
}


