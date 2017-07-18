package com.designpatterns.creational.factory;

public class TestMovieFactory {

	public static void main(String[] args) {
		Movies marathiMovies = MoviesFactory.getMovies(Movies.MOVIE_MARATHI,
				"Duniyadari");
		Movies marathiMovies1 = MoviesFactory.getMovies(Movies.MOVIE_MARATHI,
				"Sairat");
		Movies hindiMovies = MoviesFactory.getMovies(Movies.MOVIE_HINDI,
				"Hindi");

		System.out.println("  marathiMovies" + marathiMovies.toString());
		

		System.out.println("  marathiMovies1 " + marathiMovies1.toString());
	}
}
