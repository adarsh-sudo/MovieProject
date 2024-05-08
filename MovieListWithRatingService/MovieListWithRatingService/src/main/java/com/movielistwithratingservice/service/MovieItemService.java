package com.movielistwithratingservice.service;

import java.util.List;



import com.movielistwithratingservice.entity.MovieItem;
public interface MovieItemService {
	
	public List<MovieItem> getMovieItems(String movieId);

}
