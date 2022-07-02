package com.muhammet.entity;

import java.util.Date;

public class BaglantiYonetim {

	/**
	 * Metodlar, Deðiþkenler
	 */
	
	private String baglantiUrl= "Ankara";
	/**
	 * 
	 * @param yeniBaglantiUrl -> yeni baðlantý deðeri string giriniz
	 * @param token -> her programcý tarafýnda deðiþkenini deðiþtirilmesi için kendisine tahis edilmiþ benzersiz bir anahtardýr
	 */
	public void setBaglantiUrl(String yeniBaglantiUrl, String token) {
		if(token.equals("admin0")) {
			System.out.println("log-> yetkili kiþi ......: "+ token);
			System.out.println("log-> eski kayýt ......: "+ baglantiUrl);
			System.out.println("log-> yeni kayýt ......: "+ yeniBaglantiUrl);
			System.out.println("log-> timestamp ......: "+ new Date().getTime());
			baglantiUrl = yeniBaglantiUrl;
			System.out.println("Baðlantý baþarý ile deðiþti");
		}else {
			System.out.println("Yetkisiz iþlem...");
		}
		
	}
	
	public String getBaglantiUrl() {
		return baglantiUrl;
	}
	
}


