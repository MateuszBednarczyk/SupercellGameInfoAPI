package com.matthew.clashofclansmodule.repositories;

import com.matthew.clashofclansmodule.entities.ClanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClanRepository extends JpaRepository<ClanEntity, Long> {
}
