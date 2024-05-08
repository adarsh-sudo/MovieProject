package com.movieratingservice.service;

import java.util.List;

import com.movieratingservice.entity.Rating;

public interface RatingService {

	
	public List<Rating> getRatings(String userId);
}
