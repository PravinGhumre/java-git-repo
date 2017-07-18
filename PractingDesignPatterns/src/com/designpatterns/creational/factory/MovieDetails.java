package com.designpatterns.creational.factory;

public class MovieDetails {

	private String actor;
	private String actress;
	private String director;
	private String musicDirector;

	public MovieDetails(String actor, String actress, String director,
			String musicDirector) {
		super();
		this.actor = actor;
		this.actress = actress;
		this.director = director;
		this.musicDirector = musicDirector;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActress() {
		return actress;
	}

	public void setActress(String actress) {
		this.actress = actress;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getMusicDirector() {
		return musicDirector;
	}

	public void setMusicDirector(String musicDirector) {
		this.musicDirector = musicDirector;
	}

}
