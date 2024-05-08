package com.movieratingservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieratingservice.entity.Rating;
import com.movieratingservice.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingAPI {
	
	
	@Autowired
	RatingService ratingService;
	
	 @GetMapping("/{userId}")
		public List<Rating> getRatings(@PathVariable("userId") String userId)
		{
			
			return ratingService.getRatings(userId);
		}
		
		
		
	

}
