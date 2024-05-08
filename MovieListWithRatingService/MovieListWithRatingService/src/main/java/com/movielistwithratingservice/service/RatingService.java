package com.movielistwithratingservice.service;

import java.util.List;

import com.movielistwithratingservice.entity.Rating;

public interface RatingService {
	
	public List<Rating> responseEntity(String userId);

}
