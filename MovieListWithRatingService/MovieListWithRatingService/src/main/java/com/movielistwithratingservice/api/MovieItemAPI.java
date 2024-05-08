package com.movielistwithratingservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movielistwithratingservice.entity.MovieItem;
import com.movielistwithratingservice.service.MovieItemService;

@RestController
@RequestMapping("/list")
public class MovieItemAPI {
	
	
	@Autowired
	@Qualifier("movieItemServiceImpl")
	private MovieItemService movieItemService;
	
	@GetMapping("/{userId}")
	public List<MovieItem>getMovieItems(@PathVariable("userId") String userId)
	{
		
		
		
		
		
		return movieItemService.getMovieItems(userId);
		
		
		
	}

}
