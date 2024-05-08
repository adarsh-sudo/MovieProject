
package com.movielistwithratingservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.movielistwithratingservice.entity.Rating;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service("ratingServiceImpl")
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RestTemplate restTemplate;
    

    @CircuitBreaker(name = "ratingErrorCb", fallbackMethod = "ratingError")
    @Bulkhead(name = "B4" , fallbackMethod = "ratingBError")
    public List<Rating> responseEntity(String userId) {
     
            ResponseEntity<List<Rating>> responseEntity = restTemplate.exchange(
                "http://movieratingservice/rating/" + userId,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Rating>>() {}
            );
            return responseEntity.getBody();
       
    }

    public List<Rating> ratingError(String userId ,Throwable throwable) {
        return Arrays.asList(
                new Rating("notpresent" , userId , 4)
        );
    }
    
    public List<Rating> ratingBError(String userId ,Throwable throwable) {
        return Arrays.asList(
                new Rating("notpresent" , userId , 2)
        );
    }
}
