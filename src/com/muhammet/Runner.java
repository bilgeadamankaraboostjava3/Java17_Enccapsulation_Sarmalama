package com.muhammet;

import com.muhammet.entity.BaglantiYonetim;

public class Runner {

	public static void main(String[] args) {
		
		BaglantiYonetim yonetim = new BaglantiYonetim();
		System.out.println("Ba�lant� De�i�meden ....: "+ yonetim.getBaglantiUrl());
		yonetim.setBaglantiUrl("�stanbul","admin");
		System.out.println("Ba�lant� De�i�tikten sonra ....: "+ yonetim.getBaglantiUrl());

		
	}

}
