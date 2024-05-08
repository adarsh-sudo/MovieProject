package com.moviedetailsservice.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.moviedetailsservice.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, String>{
	
	@Query("Select m from Movie m where movieId = ?1")
	public Movie getByMovieId(String movieId);
	

}
