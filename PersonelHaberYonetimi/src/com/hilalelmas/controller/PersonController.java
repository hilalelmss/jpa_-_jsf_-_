package com.hilalelmas.controller;

import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.hilalelmas.entity.Person;
import com.hilalelmas.jdbc.MyDatabase;

@ManagedBean
@SessionScoped
public class PersonController {
	Person personAdd;

	@PostConstruct
	public void init() {
		personAdd = new Person();
	}

	public void save() {
		System.out.println(personAdd.getName());
		MyDatabase database = new MyDatabase();
		personAdd.setId(UUID.randomUUID().toString());
		database.addPerson(personAdd);
	
	}
	

	public void setPersonAdd(Person personAdd) {
		this.personAdd = personAdd;
	}

	public Person getPersonAdd() {
		return personAdd;
	}
}