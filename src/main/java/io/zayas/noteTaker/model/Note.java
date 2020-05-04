package io.zayas.noteTaker.model;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class Note {
	
	@Id
	private Integer idnotes;
	
	private String title;
	
	private String note;

	public Integer getIdnotes() {
		return idnotes;
	}

	public String getTitle() {
		return title;
	}

	public String getNote() {
		return note;
	}

	public void setIdnotes(Integer idnotes) {
		this.idnotes = idnotes;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
	
}
