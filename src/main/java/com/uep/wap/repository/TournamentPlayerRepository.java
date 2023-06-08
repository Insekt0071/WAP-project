package com.uep.wap.repository;

import com.uep.wap.model.TournamentPlayer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentPlayerRepository extends CrudRepository<TournamentPlayer, Long> {
    // additional custom queries can be defined here
}
