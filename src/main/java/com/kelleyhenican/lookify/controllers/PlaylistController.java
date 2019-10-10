package com.kelleyhenican.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kelleyhenican.lookify.models.Song;
import com.kelleyhenican.lookify.services.PlaylistService;

@Controller
public class PlaylistController {
	 private final PlaylistService playlistService;
	    
	    public PlaylistController(PlaylistService playlistService) {
	        this.playlistService = playlistService;
	    }
	    
	    @RequestMapping("/") 
	    	public String index() {
	    	return "/playlist/index.jsp";
	    	}     
	    
	    @RequestMapping("/dashboard")
	    public String dashboard(Model model) {
	    	 List<Song> songs = playlistService.allSongs();
	         model.addAttribute("songs", songs);
	         return "/playlist/dashboard.jsp";
	    }
	    
	    @RequestMapping("/songs/new")
	    public String newSong(@ModelAttribute("song") Song song) {
	        return "/playlist/new.jsp";
	    }
	    @RequestMapping(value="/songs", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/playlist/new.jsp";
	        } else {
	            playlistService.createSong(song);
	            return "redirect:/dashboard";
	        }
	    }
	    
	    @RequestMapping("/search/topTen")
	    public String displayTopTen(Model model) {
	    	List<Song> songs = playlistService.topTen();
	    	model.addAttribute("songs", songs);
	    	return "/playlist/topTen.jsp";
	    }
	    
	    @RequestMapping(value="/search")
	    public String displayArtistPage(@RequestParam(value="q") String artist, Model model) {
	    	List<Song> songs = playlistService.findArtist(artist);
	    	model.addAttribute("songs", songs);
	    	return "/playlist/artist.jsp";
	    }
	    
	    
	    
}
