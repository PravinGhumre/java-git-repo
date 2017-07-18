package com.designpatterns.creational.factory;

public class EnglishMovies extends Movies {

	public EnglishMovies(String movieName) {
		this.movieName = movieName;
	}
	
	@Override
	public String getActor() {
		return null;
	}

	@Override
	public String getActress() {
		return null;
	}

	@Override
	public String getDirector() {
		return null;
	}

	@Override
	public String getMusicDirector() {
		return null;
	}

}
