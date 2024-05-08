package com.moviedetailsservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.moviedetailsservice.entity.Movie;
import com.moviedetailsservice.repository.MovieRepository;


@Service
@Transactional
public class MovieServiceImpl implements MovieService{
	
	
	@Autowired
	private MovieRepository movieRepository;
	
	
	public Movie getMovies(String movieId) {
		
		return  movieRepository.getByMovieId(movieId);
		
		
		
		
		
	}
	
	
	
	

}
