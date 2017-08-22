package com.hilalelmas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Assessment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@OneToOne
	Person person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getAssessmentNote() {
		return assessmentNote;
	}

	public void setAssessmentNote(String assessmentNote) {
		this.assessmentNote = assessmentNote;
	}

	String assessmentNote;

}
