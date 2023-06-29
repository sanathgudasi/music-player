package com.ripplestreet.musicplayer.controller;


import com.ripplestreet.musicplayer.service.SongsService;
import com.ripplestreet.musicplayer.controller.SongController;

public class SongController {
	
	SongsService service = new SongsService();
	
	public void insertSong(int id, String name, String singer, String movie) {
		service.insertSong(id, name, singer, movie);
	}
	
	public void deleteSong(int id) {
		service.deleteSong(id);
	}
	
	public void updateSong(int id, String name, String singer, String movie) {
		service.updateSong(id, name, singer, movie);
	}
	
	public void getSong(int id) {
		service.getSong(id);
	}
	
	public void getList() {
		service.getList();
	}
		
	
}

