package io.zayas.noteTaker.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import io.zayas.noteTaker.model.Note;

public interface NoteMapper {

	@Insert("INSERT INTO FA19_3308_tug92199.notes Values(#{title}, #{message}")
	Note addNote(@Param("title") String title, @Param("message") String message);
	
	
	@Select("SELECT * FROM FA19_3308_tug92199.notes")
	List<Note> getNotes();
	
	@Delete("DELETE FROM FA19_3308_tug92199.notes WHERE idnotes=#{id}")
	Void deleteNote(@Param("id") int id);
}


