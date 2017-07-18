package com.designpatterns.creational.factory;

public class MarathiMovies extends Movies {
	MovieDetails movieDetails = null;

	public MarathiMovies(String movieName) {
		this.movieName = movieName;
		movieDetails = movieLibrary.get(movieName);
	}

	@Override
	public String getActor() {
		return movieDetails.getActor();
	}

	@Override
	public String getActress() {
		return movieDetails.getActress();
	}

	@Override
	public String getDirector() {
		return movieDetails.getDirector();
	}

	@Override
	public String getMusicDirector() {
		return movieDetails.getMusicDirector();
	}

}
