package com.krakedev.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.entidades.Aliens;

class PruebasJUnit {

	@Test
	public void testAsignacionAtributos() {
		Aliens alien = new Aliens(15, "Verde");
        assertEquals(15, alien.getTamaño());
        assertEquals("Verde", alien.getColor());
	}
	
	@Test
	public void testRestriccionTamañoMinimo() {
		Aliens alienPequeño = new Aliens(2, "Rojo");
        assertEquals(5, alienPequeño.getTamaño(), "El tamaño mínimo debe ser ajustado a 5 cm");
	}
	
	@Test
	public void testRestriccionTamañoMaximo() {
        Aliens alienGrande = new Aliens(45, "Azul");
        assertEquals(30, alienGrande.getTamaño(), "El tamaño máximo debe ser ajustado a 30 cm");
    }
	
	@Test
	public void testCalculoPrecios() {

        Aliens alien = new Aliens(20, "Morado");
        
        assertEquals(4.0, alien.getPrecioCuerpo(), 0.01);
        
        assertEquals(2.0, alien.getPrecioExtremidad(), 0.01);
        
        assertEquals(1.0, alien.getPrecioOjo(), 0.01);
    }
}
