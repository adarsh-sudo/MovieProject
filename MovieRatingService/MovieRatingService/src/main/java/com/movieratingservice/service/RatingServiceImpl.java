package com.movieratingservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movieratingservice.entity.Rating;
import com.movieratingservice.repository.RatingRepository;


@Service
@Transactional
public class RatingServiceImpl implements RatingService{
	

	@Autowired
	private RatingRepository ratingRepository;
	
    public List<Rating> getRatings(String userId) {
		
		return  ratingRepository.getByMovieId(userId);
		
		
		
		
		
	}

}
