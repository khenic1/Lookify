package com.kelleyhenican.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kelleyhenican.lookify.models.Song;


@Repository
public interface PlaylistRepository extends CrudRepository<Song, Long> {
	List<Song> findAll();
	List<Song> findAllByOrderByIdAsc();
	List<Song> findTop10ByOrderByRatingDesc();
	List<Song> findByArtist(String artist);
	
}
