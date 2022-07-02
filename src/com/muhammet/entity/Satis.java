package com.muhammet.entity;

import java.util.Date;
import java.util.Random;

public class Satis {
	
	long id;
	String personel;
	long satistarihi;
	long islemtarihi;
	Urun urun;
	int adet;
	double fiyat;
	double toplamfiyat;
	
	
	public Satis(String personel, long satistarihi, Urun urun, int adet, double fiyat) {
		this.personel = personel;
		this.satistarihi = satistarihi;
		this.urun = urun;
		this.adet = adet;
		this.fiyat = fiyat;
		this.id = new Random().nextLong();
		islemtarihi = new Date().getTime();// içinde bulunduðumuz anýn long olarak deðerini verir
		toplamfiyat = adet * fiyat;
	}
	
	@Override
	public String toString() {
		return "Satis [id=" + id + ", personel=" + personel + ", satistarihi=" + satistarihi + ", islemtarihi="
				+ islemtarihi + ", urun=" + urun + ", adet=" + adet + ", fiyat=" + fiyat + ", toplamfiyat="
				+ toplamfiyat + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPersonel() {
		return personel;
	}
	public void setPersonel(String personel) {
		this.personel = personel;
	}
	public long getSatistarihi() {
		return satistarihi;
	}
	public void setSatistarihi(long satistarihi) {
		this.satistarihi = satistarihi;
	}
	public long getIslemtarihi() {
		return islemtarihi;
	}
	public void setIslemtarihi(long islemtarihi) {
		this.islemtarihi = islemtarihi;
	}
	public Urun getUrun() {
		return urun;
	}
	public void setUrun(Urun urun) {
		this.urun = urun;
	}
	public int getAdet() {
		return adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public double getToplamfiyat() {
		return toplamfiyat;
	}
	public void setToplamfiyat(double toplamfiyat) {
		this.toplamfiyat = toplamfiyat;
	}
	
	

}
