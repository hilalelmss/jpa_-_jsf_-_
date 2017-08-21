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
		haber1.setDuyuru("escape()=>Bir karakter dizisini unicode formatýnda þifreler. "
				+ "Genellikle URL satýrlarýnýn kullanýmýnda sorun çýkaran ($, #, &, boþluk) karakterlerini düzeltmek amacýyla kullanýlýr.");

		Haber haber2 = new Haber();
		haber2.setSira(2);
		haber2.setDuyuru("isNaN()=>Deðiþken veya deðerin rakam olup olmadýðýný kontrol eder. "
				+ "rakam ise false deðilse true deðeri döner.");

		Haber haber3 = new Haber();
		haber3.setSira(3);
		haber3.setDuyuru(
				"eval()=>Girilen parametreyi tüm sayfada arar, bulduðunda JavaScript kodlarýna çevirir ve çalýþtýrýr. "
						+ "Parametre eðer bir operatör ise operatör iþlemi yapar.");

		Haber haber4 = new Haber();
		haber4.setSira(4);
		haber4.setDuyuru(
				"isFinite()=>Girilen deðerin pozitif veya negatif sýnýrý aþýp aþmadýðýný kontrol eder. Sýnýr 1.79e+308 dir. "
						+ "Bu pozitif sýnýr aþýlmýþsa true deðerini gönderir.");
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
