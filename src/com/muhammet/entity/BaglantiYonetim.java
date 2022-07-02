package com.muhammet.entity;

import java.util.Date;

public class BaglantiYonetim {

	/**
	 * Metodlar, De�i�kenler
	 */
	
	private String baglantiUrl= "Ankara";
	/**
	 * 
	 * @param yeniBaglantiUrl -> yeni ba�lant� de�eri string giriniz
	 * @param token -> her programc� taraf�nda de�i�kenini de�i�tirilmesi i�in kendisine tahis edilmi� benzersiz bir anahtard�r
	 */
	public void setBaglantiUrl(String yeniBaglantiUrl, String token) {
		if(token.equals("admin0")) {
			System.out.println("log-> yetkili ki�i ......: "+ token);
			System.out.println("log-> eski kay�t ......: "+ baglantiUrl);
			System.out.println("log-> yeni kay�t ......: "+ yeniBaglantiUrl);
			System.out.println("log-> timestamp ......: "+ new Date().getTime());
			baglantiUrl = yeniBaglantiUrl;
			System.out.println("Ba�lant� ba�ar� ile de�i�ti");
		}else {
			System.out.println("Yetkisiz i�lem...");
		}
		
	}
	
	public String getBaglantiUrl() {
		return baglantiUrl;
	}
	
}


