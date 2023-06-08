package com.uep.wap.repository;

import com.uep.wap.model.Match;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends CrudRepository<Match, Long> {
    // additional custom queries can be defined here
}
