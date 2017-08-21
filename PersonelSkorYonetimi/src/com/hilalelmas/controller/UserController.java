package com.hilalelmas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.hilalelmas.entity.Haber;

@ManagedBean
@SessionScoped
public class UserController {
	List<Haber> haberler;

	@PostConstruct
	public void init() {
		haberler = new ArrayList<>();
		Haber haber1 = new Haber();
		haber1.setSira(1);
		haber1.setDuyuru("escape()=>Bir karakter dizisini unicode format�nda �ifreler. "
				+ "Genellikle URL sat�rlar�n�n kullan�m�nda sorun ��karan ($, #, &, bo�luk) karakterlerini d�zeltmek amac�yla kullan�l�r.");

		Haber haber2 = new Haber();
		haber2.setSira(2);
		haber2.setDuyuru("isNaN()=>De�i�ken veya de�erin rakam olup olmad���n� kontrol eder. "
				+ "rakam ise false de�ilse true de�eri d�ner.");

		Haber haber3 = new Haber();
		haber3.setSira(3);
		haber3.setDuyuru(
				"eval()=>Girilen parametreyi t�m sayfada arar, buldu�unda JavaScript kodlar�na �evirir ve �al��t�r�r. "
						+ "Parametre e�er bir operat�r ise operat�r i�lemi yapar.");

		Haber haber4 = new Haber();
		haber4.setSira(4);
		haber4.setDuyuru(
				"isFinite()=>Girilen de�erin pozitif veya negatif s�n�r� a��p a�mad���n� kontrol eder. S�n�r 1.79e+308 dir. "
						+ "Bu pozitif s�n�r a��lm��sa true de�erini g�nderir.");
		haberler.add(haber1);
		haberler.add(haber2);
		haberler.add(haber3);
		haberler.add(haber4);
		
	}

	public void setHaberler(List<Haber> haberler) {
		this.haberler = haberler;
	}

	public List<Haber> getHaberler() {
		return haberler;
	}

}
