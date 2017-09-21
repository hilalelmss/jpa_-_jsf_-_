package com.hilalelmas.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ADao {
	protected EntityManager em;

	public ADao() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonelHaberYonetimi");
		this.em = emf.createEntityManager();
	}
}
