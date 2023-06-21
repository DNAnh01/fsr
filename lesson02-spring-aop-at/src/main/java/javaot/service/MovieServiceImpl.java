package javaot.service;


// Joint Point
public class MovieServiceImpl implements MovieService{

	@Override
	public void addMovie() {
		System.out.println("MovieServiceImpl # addMovie");
	}

	@Override
	public void updateMovie() {
		System.out.println("MovieServiceImpl # updateMovie");
	}

	@Override
	public String getMovie() {
		return "MovieServiceImpl # getMovie";
	}

	@Override
	public void validateMovie() throws Exception {
		System.out.println("MovieServiceImpl # validateMovie");
	}
	
}
