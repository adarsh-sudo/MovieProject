package com.movielistwithratingservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.movielistwithratingservice.entity.Movie;
import com.movielistwithratingservice.entity.MovieItem;
import com.movielistwithratingservice.entity.Rating;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@Service
public class MovieInfoServiceImpl implements MovieInfoService{
	
	@Autowired
	private RestTemplate restTemplate;
	
	@CircuitBreaker(name = "movieInfoErrorCb"  , fallbackMethod = "movieInfoError")
	@Bulkhead(name = "B1" , fallbackMethod = "movieInfoBError")
	public MovieItem movieResponseEntity(Rating rating)
	{
		
        	ResponseEntity<Movie> movieResponseEntity =  restTemplate.exchange(
                    "http://moviedetailsservice/movie/" + rating.getMovieId(),
                    HttpMethod.GET,
                    null,
                    Movie.class  // Expected response type
                );

                Movie movie = movieResponseEntity.getBody();

               
                return new MovieItem(movie.getName(), "desc", rating.getRating());
              
		
	}
	
	
	public MovieItem movieInfoError( Rating rating , Throwable throwable) {
		
		return new MovieItem("movienameunavailable", "desc", rating.getRating());
	}
	
    public MovieItem movieInfoBError( Rating rating , Throwable throwable) {
		
		return new MovieItem("movienameunavailableBulkhead", "desc", rating.getRating());
	}

}
