package com.ripplestreet.musicplayer.dto;

public class Song {
	private Integer id;
	private String name;
	private String singer;
	private String movie;

	public Song(Integer id, String name, String singer, String movie) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.movie = movie;
	}
	
	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", singer=" + singer + ", movie=" + movie + "]";
	}

	
}
