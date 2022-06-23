package com.matthew.clashofclansmodule.models.repositories;

import com.matthew.clashofclansmodule.models.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {

    PlayerEntity findByTag(String tag);

}
