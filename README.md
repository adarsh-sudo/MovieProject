# MovieProject


Spearheaded the development and orchestration of three microservices: MovieListWithRatingService, MovieDetailsService, and MovieRatingService, each serving distinct functionalities within a cohesive ecosystem.
Facilitated seamless communication between microservices using RestTemplate, ensuring smooth data transfer from MovieDetailsService and MovieRatingService to MovieListWithRatingService. Leveraged Eureka for service discovery, eliminating dependencies on specific port configurations and enhancing scalability.
Implemented resilience mechanisms using Resilience4j within Spring Boot to enhance application robustness, including the incorporation of circuit breakers and bulkheads to mitigate service failures.
Additional resilience features such as rate limiting, time limiting, and retry mechanisms can also be incorporated in future, bolstering the application's resilience and scalability.
