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
		haber1.setYanardagPatlamalari("Tambora Dağı:: "
				+ "Tambora’da yaşanan patlamada 92.000 kişi hayatını kaybetmiştir. Patlamanın etkileri kilometrelerce uzaklarda bile hissedilmiştir."
				+ "Patlama sebebiyle 1816 yılı “yazsız yıl” ilan edilmiştir. ");

		Haber haber2 = new Haber();
		haber2.setSira(2);
		haber2.setYanardagPatlamalari("Pelee Dağı:: "
				+ "25 Nisan 1902 yılında başlayan patlamalar 8 Mayıs’a kadar devam etti. Tamamıyla yerle bir olan St. Pierre kentinde son patlamada 25.000 kişi hayatını kaybetti."
				+ "Sağ kalmayı başaran 2 kişiden biri hücrede tutulan bir mahkum ve diğeri de şehrin dışarısında yaşayan bir adam oldu.");

		Haber haber3 = new Haber();
		haber3.setSira(3);
		haber3.setYanardagPatlamalari("Krakatoa Dağı:: "
				+ "1883 yılında patlayan Krakatoa Dağı, adanın 2/3’ünü yerle bir etti. Patlamanın sesi o kadar şiddetliydi ki Avustralya’dan bile duyulduğu kayıtlara geçti."
				+ "Patlama sebebiyle hiç kimse hayatını kaybetmedi. Tüm ölümlerin sebebi patlamaya bağlı ortaya çıkan tsunamiydi.");

		Haber haber4 = new Haber();
		haber4.setSira(4);
		haber4.setYanardagPatlamalari("Nevado del Ruiz:: "
				+ "Patlama küçük olsa da yanardağın tepesindeki buz kütlesini eriterek devasa bir çamur kaymasına sebep oldu. Çamur altında kalan Armero şehrinde 23.000 kişi hayatını kaybetti.");
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
