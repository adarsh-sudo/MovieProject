package com.moviedetailsservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviedetailsservice.entity.Movie;
import com.moviedetailsservice.service.MovieService;



@RestController
@RequestMapping("/movie")
public class MovieAPI {
	
    @Autowired
	private MovieService movieService;
	
    
    @GetMapping("/{movieId}")
	public Movie getMovies(@PathVariable("movieId") String movieId)
	{
		
		return movieService.getMovies(movieId);
	}
	
	
	
	
	
	

}
