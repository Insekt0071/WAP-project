package com.uep.wap.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.uep.wap.model.Player;
import com.uep.wap.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    // additional custom queries can be defined here
}
