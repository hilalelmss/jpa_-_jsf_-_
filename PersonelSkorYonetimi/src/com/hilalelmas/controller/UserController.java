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
		haber1.setYanardagPatlamalari("Tambora Da��:: "
				+ "Tambora�da ya�anan patlamada 92.000 ki�i hayat�n� kaybetmi�tir. Patlaman�n etkileri kilometrelerce uzaklarda bile hissedilmi�tir."
				+ "Patlama sebebiyle 1816 y�l� �yazs�z y�l� ilan edilmi�tir. ");

		Haber haber2 = new Haber();
		haber2.setSira(2);
		haber2.setYanardagPatlamalari("Pelee Da��:: "
				+ "25 Nisan 1902 y�l�nda ba�layan patlamalar 8 May�s�a kadar devam etti. Tamam�yla yerle bir olan St. Pierre kentinde son patlamada 25.000 ki�i hayat�n� kaybetti."
				+ "Sa� kalmay� ba�aran 2 ki�iden biri h�crede tutulan bir mahkum ve di�eri de �ehrin d��ar�s�nda ya�ayan bir adam oldu.");

		Haber haber3 = new Haber();
		haber3.setSira(3);
		haber3.setYanardagPatlamalari("Krakatoa Da��:: "
				+ "1883 y�l�nda patlayan Krakatoa Da��, adan�n 2/3��n� yerle bir etti. Patlaman�n sesi o kadar �iddetliydi ki Avustralya�dan bile duyuldu�u kay�tlara ge�ti."
				+ "Patlama sebebiyle hi� kimse hayat�n� kaybetmedi. T�m �l�mlerin sebebi patlamaya ba�l� ortaya ��kan tsunamiydi.");

		Haber haber4 = new Haber();
		haber4.setSira(4);
		haber4.setYanardagPatlamalari("Nevado del Ruiz:: "
				+ "Patlama k���k olsa da yanarda��n tepesindeki buz k�tlesini eriterek devasa bir �amur kaymas�na sebep oldu. �amur alt�nda kalan Armero �ehrinde 23.000 ki�i hayat�n� kaybetti.");
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
