package io.zayas.noteTaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import io.zayas.noteTaker.mapperManager.NoteMapperManager;


@Controller
@RequestMapping("/note")
public class NoteController {
	
	@Autowired
	private NoteMapperManager noteMapper;

	@PostMapping("/add")
	public @ResponseBody String addNote(@RequestParam String title, @RequestParam String message){
		
		noteMapper.addNote(title, message);
		
		return "works";
	}
	
	@GetMapping("/notes")
	public @ResponseBody String getNotes() {
		Gson gson = new Gson();
		String json = gson.toJson(noteMapper.getNotes());
		return json;
	}
	
	@DeleteMapping("/delete")
	public @ResponseBody void deleteNote(@RequestParam int id) {
			noteMapper.deleteNote(id);
			
	}
}
