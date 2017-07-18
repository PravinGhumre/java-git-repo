package com.designpatterns.creational.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Movies {

	public static final String MOVIE_MARATHI = "MARATHI";
	public static final String MOVIE_HINDI = "HINDI";
	public static final String MOVIE_ENGLISH = "ENGLISH";

	static Map<String, MovieDetails> movieLibrary = new ConcurrentHashMap<>();
	public String movieName;

	static {
		movieLibrary.put("Duniyadari", new MovieDetails("Swapnil Joshi",
				"Saee Tamhankar", "Sanjay Jadhav", "Pankaj Padghan"));
		movieLibrary.put("Sairat", new MovieDetails("Akash Thosar",
				"Rinku Rajguru", "Nagarah Munjule", "Ajay-Atul"));
	}

	public abstract String getActor();

	public abstract String getActress();

	public abstract String getDirector();

	public abstract String getMusicDirector();

	@Override
	public String toString() {

		return "Actor => " + this.getActor() + "\n  Actress => "
				+ this.getActress() + "\n  Director => " + this.getDirector()
				+ "\n  MusicDirector => " + this.getMusicDirector();
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
