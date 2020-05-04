package io.zayas.noteTaker.mapperManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.zayas.noteTaker.mapper.NoteMapper;
import io.zayas.noteTaker.model.Note;

@Component

public class NoteMapperManager {


	private ArrayList<Note> databaseMoc = new ArrayList<>();
	
	
	/**
	 * Adds a note to db
	 * @param title
	 * @param message
	 */
	public void addNote(String title, String message) {
		//note.addNote(title, message);
		Note tmp = new Note();
		if(databaseMoc.size() == 0) {
			tmp.setIdnotes(0);
		}else {
			tmp.setIdnotes(databaseMoc.get(databaseMoc.size() -1).getIdnotes() + 1);
		}
		
		tmp.setTitle(title);
		tmp.setNote(message);
		databaseMoc.add(tmp);
	}
	
	
	/**
	 * Returns all the notes in the db
	 * @return
	 */
	public List<Note> getNotes(){
		//return note.getNotes();
		return databaseMoc;
	}
	
	/**
	 * Deletes a Note from db
	 * @param id
	 */
	public void deleteNote(int id) {
		//note.delete(id);
		for(Note n : databaseMoc) {
			if(n.getIdnotes() == id) {
				databaseMoc.remove(n);
			}
		}
	}
}
