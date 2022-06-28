package com.matthew.clashofclansmodule.repositories;

import com.matthew.clashofclansmodule.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {

    PlayerEntity findByTag(String tag);

    void deleteByTag(String tag);

}
