package com.ALTbruno.dsmovie.controllers;

import com.ALTbruno.dsmovie.dto.MovieDTO;
import com.ALTbruno.dsmovie.dto.ScoreDTO;
import com.ALTbruno.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

	@Autowired
	private ScoreService scoreService;

	@PutMapping(value = "/{id}")
	public MovieDTO saveScore(@RequestBody ScoreDTO scoreDTO) {

		MovieDTO movieDTO = scoreService.saveScore(scoreDTO);

		return movieDTO;
	}
}
