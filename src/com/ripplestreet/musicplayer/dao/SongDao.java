package com.ripplestreet.musicplayer.dao;

import java.util.HashMap;
import java.util.Map;

import com.ripplestreet.musicplayer.dto.Song;
import com.ripplestreet.musicplayer.repository.SongRepository;

public class SongDao implements SongRepository{
	
	public Map<Integer, Song> songList = new HashMap<>();
 
	public Song insertSong(Song song) {
		songList.put(song.getId(), song);
		return song;
	}
	
	public int deleteSong(int id) {
			songList.remove(id);
			return id;
	}
	
	public Song updateSong(Song song) {
		songList.put(song.getId(), song);
		return song;
	}
	
	public Song getSong(int id) {
		Song song = songList.get(id);
		return song;
	}
	public Map<Integer, Song> getList() {
		return songList;
	}
}