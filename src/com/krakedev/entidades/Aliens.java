package com.krakedev.entidades;

public class Aliens {
	private int tamaño;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;
	
	public Aliens(int tamaño, String color) {
		if(tamaño < 5) {
			this.tamaño = 5;
		}else if(tamaño > 30){
			this.tamaño = 30;
		}else {
			this.tamaño=tamaño;
		}
		this.color=color;
		this.numeroBrazos=0;
		this.numeroOjos=0;
		this.numeroPies=0;
		this.precioCuerpo = this.tamaño * 0.20;      
        this.precioExtremidad = this.tamaño * 0.10;   
        this.precioOjo = this.tamaño * 0.05;
	}
}
