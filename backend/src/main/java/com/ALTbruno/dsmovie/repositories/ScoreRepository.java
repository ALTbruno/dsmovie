package com.ALTbruno.dsmovie.repositories;

import com.ALTbruno.dsmovie.entities.Score;
import com.ALTbruno.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
