package javaot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// MovieRecommender as a bean("movieRecommender")

// Restrict --> initial bean via empty constructor

// Require --> scan


// bean
@Component
public class MovieRecommender {
	
	
	// MovieRecommender has a dependency MovieCatalog
	
	// unique --> initActionMovie
	
	// <property name="movieCatalog" ref="initActionMovie">
	@Autowired
	@Qualifier("initAcventureMovie")
	private MovieCatalog movieCatalog;
	
	
	public void recommend() {
//		System.out.println("MovieRecommender -->  unknown ...");
		movieCatalog.showMovie();
	}
}
