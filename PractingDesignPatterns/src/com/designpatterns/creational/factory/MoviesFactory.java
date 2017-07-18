package com.designpatterns.creational.factory;

public class MoviesFactory {

	public static Movies getMovies(String movieType, String movieName) {

		if (Movies.MOVIE_MARATHI.equalsIgnoreCase(movieType)) {
			return new MarathiMovies(movieName);
		} else if (Movies.MOVIE_HINDI.equalsIgnoreCase(movieType)) {
			return new HindiMovies(movieName);
		} else if (Movies.MOVIE_ENGLISH.equalsIgnoreCase(movieType)) {
			return new EnglishMovies(movieName);
		} else {
			return null;
		}
	}
}
