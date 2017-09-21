package com.hilalelmas.dao;

import java.util.List;

import com.hilalelmas.entity.Assessment;
import com.hilalelmas.entity.Person;

public class DAO extends ADao {

	public List<Person> getPersonList() {
		return this.em.createQuery("SELECT c FROM Person c").getResultList();
	}

	public void save(Assessment assAdd) {
		em.getTransaction().begin();
		em.persist(assAdd);
		em.getTransaction().commit();

	}

	public List<Assessment> getAssment() {
		return this.em.createQuery("SELECT c FROM Assessment c").getResultList();
	}

}
