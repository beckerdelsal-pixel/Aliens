package com.krakedev.test;

import com.krakedev.entidades.Aliens;

public class TestConstructores {

	public static void main(String[] args) {
		Aliens alien1 = new Aliens(30,"Verde");
		alien1.imprimir();
		Aliens alien2 = new Aliens(25,"Rojo");
		alien2.imprimir();
	}

}
