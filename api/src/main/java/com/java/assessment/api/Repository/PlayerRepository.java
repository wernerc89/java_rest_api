package com.java.assessment.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.assessment.api.Entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
}