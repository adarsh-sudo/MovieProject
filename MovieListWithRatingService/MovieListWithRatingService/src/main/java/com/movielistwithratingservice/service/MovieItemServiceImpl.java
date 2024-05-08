package com.movielistwithratingservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movielistwithratingservice.entity.MovieItem;
import com.movielistwithratingservice.entity.Rating;

@Service("movieItemServiceImpl")
public class MovieItemServiceImpl implements MovieItemService {
    
	@Autowired
    private RatingService ratingService;
	
	@Autowired
	private MovieInfoService movieInfoService;
 

  public List<MovieItem> getMovieItems(String userId) {
        // Fetch ratings for the given userId
        List<Rating> ratings = ratingService.responseEntity(userId);

    

        // Fetch movie details for each rating
        return ratings.stream()
                .map(rating -> movieInfoService.movieResponseEntity(rating))
                .toList();
        
        

    }
 
}
