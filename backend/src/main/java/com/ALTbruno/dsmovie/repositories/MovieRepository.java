package com.ALTbruno.dsmovie.repositories;

import com.ALTbruno.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
