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
	private double precioTotal = 0;
	
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

	public int getTamaño() {
		return tamaño;
	}

	public String getColor() {
		return color;
	}

	public int getNumeroOjos() {
		return numeroOjos;
	}

	public int getNumeroBrazos() {
		return numeroBrazos;
	}

	public int getNumeroPies() {
		return numeroPies;
	}

	public double getPrecioExtremidad() {
		return precioExtremidad;
	}

	public double getPrecioOjo() {
		return precioOjo;
	}

	public double getPrecioCuerpo() {
		return precioCuerpo;
	}
	
	public double getPrecioTotal() {
        return precioTotal;
    }
	
	public void imprimir() {
		System.out.println("\n*-*-*-*-*-*-*-*-*-*- ALIENS -*-*-*-*-*-*-*-*-*-*\n");
		System.out.println("TAMAÑO: "+tamaño);
		System.out.println("COLOR: "+color.toUpperCase());
		System.out.println("NUMERO DE OJOS: N°. "+numeroOjos);
		System.out.println("NUMERO DE BRAZOS: N°. "+numeroBrazos);
		System.out.println("NUMERO DE PIES: N°. "+numeroPies);
		System.out.println("PRECIO POR EXTREMIDAD: $"+precioExtremidad);
		System.out.println("PRECIO POR OJO: $"+precioOjo);
		System.out.println("PRECIO POR CUERPO: $"+precioCuerpo);
	}
	public boolean agregarBrazos(int cantidad) {
        
        if (this.numeroBrazos + this.numeroPies + cantidad <= 10) {
            this.numeroBrazos += cantidad;
            calcularPrecioTotal();
            return true;
        }
        return false;
    }

    public boolean agregarPiernas(int cantidad) {
        
        if (this.numeroBrazos + this.numeroPies + cantidad <= 10) {
            this.numeroPies += cantidad;
            calcularPrecioTotal();
            return true;
        }
        return false; 
    }
    
    public boolean agregarOjos(int cantidad) {
        int maxOjos = 0;

        if (this.tamaño >= 5 && this.tamaño <= 10) {
            maxOjos = 3; 
        } else if (this.tamaño > 10 && this.tamaño <= 20) {
            maxOjos = 5;
        } else if (this.tamaño > 20 && this.tamaño <= 30) {
            maxOjos = 7; 
        }

        if (this.numeroOjos + cantidad <= maxOjos) {
            this.numeroOjos += cantidad;
            calcularPrecioTotal();
            return true; 
        }
        
        return false; 
    }
    
    private void calcularPrecioTotal() {
        int totalExtremidades = this.numeroBrazos + this.numeroPies;
        
        this.precioTotal = this.precioCuerpo 
                         + (totalExtremidades * this.precioExtremidad) 
                         + (this.numeroOjos * this.precioOjo);
    }
}
