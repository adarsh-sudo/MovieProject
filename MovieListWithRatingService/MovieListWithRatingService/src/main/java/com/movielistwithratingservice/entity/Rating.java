package com.movielistwithratingservice.entity;


public class Rating {
	
	private String movieId;
	private String userId;
	private Integer rating;
	
	
	/**
	 * @param movieId
	 * @param userId
	 * @param rating
	 */
	public Rating(String movieId, String userId, Integer rating) {
		this.movieId = movieId;
		this.userId = userId;
		this.rating = rating;
	}

	public Rating()
	{
	
	}
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	

}
