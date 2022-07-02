package com.muhammet.entity;

public class Urun {
	/**
	 * public-> heryerden açýk
	 * private-> sadece sýnýf içine açýk
	 * proteted-> ilgili paket içine açýk (child lar dan eriþim olabilir.)
	 * default-> sadece ilgili paket içine açýk(child lar eriþemez)
	 */
	/**
	 * POJO-> Plain Old Java Object
	 * Bilinen en basit java class örneði
	 */
	
	
	
	long id;
	String ad;
	String barkod;
	double fiyat;
	int stok;
	int kdv;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getBarkod() {
		return barkod;
	}
	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public int getStok() {
		return stok;
	}
	public void setStok(int stok) {
		this.stok = stok;
	}
	public int getKdv() {
		return kdv;
	}
	public void setKdv(int kdv) {
		this.kdv = kdv;
	}
	
	
}
