package com.muhammet;

import java.util.Date;

import com.muhammet.entity.Satis;
import com.muhammet.entity.Urun;

public class Runner_Satis {

	public static void main(String[] args) {

		Urun urun = new Urun();
		Satis satis = new Satis("Ahmet",new Date().getTime(),urun,2,46);
		System.out.println(satis.toString());
	}

}
