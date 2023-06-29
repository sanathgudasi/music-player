package com.ripplestreet.musicplayer.service;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ripplestreet.musicplayer.exception.IdAlreadyExistsException;
import com.ripplestreet.musicplayer.exception.IdNotFoundException;
import com.ripplestreet.musicplayer.dao.SongDao;
import com.ripplestreet.musicplayer.dto.Song;

public class SongsService {
	SongDao dao = new SongDao();
	
	public void insertSong(int id, String name, String singer, String movie) {
		if(dao.songList.containsKey(id)) {
			throw new IdAlreadyExistsException();
		}
		else {
			Song song = new Song(id, name, singer, movie);
			dao.insertSong(song);
			System.out.println("song saved");
		}
	}
	
	public void deleteSong(int id) {
		if(dao.songList.containsKey(id)) {
			dao.songList.remove(id);
			System.out.println("song deleted with id "+ id);
		}
		else {
			throw new IdNotFoundException();
		}
	}
	
	public void updateSong(int id, String name, String singer, String movie) {
		if(dao.songList.containsKey(id)) {
			Song song = new Song(id, name, singer, movie);
			dao.updateSong(song);
			System.out.println("Song updated!!");
		}
		else {
			throw new IdNotFoundException();
		}
	}
	
	public void getSong(int id) {
		if(dao.songList.containsKey(id)) {
			Song song=dao.getSong(id);
			System.out.println(song);
		}
		else {
			throw new IdNotFoundException();
		}
	}
	
	public void getList() {
		if(dao.songList.isEmpty()) {
			System.out.println("list is empty");
		}
		else {
			Map<Integer, Song> list = dao.getList();
			System.out.println(list);
		}
	}
}