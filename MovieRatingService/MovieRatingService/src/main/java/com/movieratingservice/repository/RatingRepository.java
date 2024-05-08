package com.movieratingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.movieratingservice.entity.Rating;

public interface RatingRepository extends CrudRepository<Rating, String> {
	
	
	@Query("Select r from Rating r where userId = ?1")
	public List<Rating> getByMovieId(String userId);
	

}
