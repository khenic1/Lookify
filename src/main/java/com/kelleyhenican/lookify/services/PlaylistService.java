package com.kelleyhenican.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kelleyhenican.lookify.models.Song;
import com.kelleyhenican.lookify.repositories.PlaylistRepository;


	@Service
	public class PlaylistService {
		private final PlaylistRepository playlistRepository;
		
		public PlaylistService (PlaylistRepository playlistRepository) {
			this.playlistRepository = playlistRepository;
			
		}
		
		 // returns all the books
	    public List<Song> allSongs() {
	        return playlistRepository.findAllByOrderByIdAsc();
	    }

	    // return top ten songs
	    public List<Song> topTen() {
	    	return playlistRepository.findTop10ByOrderByRatingDesc();
	    }
	    
	 // creates a song
	    public Song createSong(Song s) {
	        return playlistRepository.save(s);
	    }
	    
	    public List<Song> findArtist(String artist) {
	    	return playlistRepository.findByArtist(artist);
	    }
}
