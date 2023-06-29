package com.ripplestreet.musicplayer.repository;

import java.util.Map;

import com.ripplestreet.musicplayer.dto.Song;

public interface SongRepository {
	
	public Song insertSong(Song song);
	public int deleteSong(int id);
	public Song updateSong(Song song);
	public Song getSong(int id);
	public Map<Integer, Song> getList();

}
