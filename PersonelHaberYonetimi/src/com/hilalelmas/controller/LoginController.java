package com.hilalelmas.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginController {
	String defaultSifre = "6878232";
	String defaultUserName = "leprax";

	//String outputKulAdi = "Kullanici Adi:";
	// String outputSifre = "�ifre:";
	String kullaniciAdi;
	String sifre;

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public String getSifre() {
		return sifre;
	}

//	public void setOutputKulAdi(String outputKulAdi) {
//		this.outputKulAdi = outputKulAdi;
//	}
//
//	public String getOutputKulAdi() {
//		return outputKulAdi;
//	}

	public String login() {
		if (getKullaniciAdi().equals(defaultUserName) && getSifre().equals(defaultSifre)) {
			return "secure/user.xhtml?faces-redirect=true";
		}
	
		return "fail.xhtml?faces-redirect=true";
	}
	

}
