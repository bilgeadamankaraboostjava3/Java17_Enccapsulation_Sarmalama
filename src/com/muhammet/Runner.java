package com.muhammet;

import com.muhammet.entity.BaglantiYonetim;

public class Runner {

	public static void main(String[] args) {
		
		BaglantiYonetim yonetim = new BaglantiYonetim();
		System.out.println("Baðlantý Deðiþmeden ....: "+ yonetim.getBaglantiUrl());
		yonetim.setBaglantiUrl("Ýstanbul","admin");
		System.out.println("Baðlantý Deðiþtikten sonra ....: "+ yonetim.getBaglantiUrl());

		
	}

}
