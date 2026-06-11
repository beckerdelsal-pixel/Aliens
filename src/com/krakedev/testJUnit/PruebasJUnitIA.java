package com.krakedev.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.krakedev.entidades.Aliens;

class PruebasJUnitIA {

	@Test
	public void testLimitesExactos() {
        Aliens alienMin = new Aliens(5, "Blanco");
        assertEquals(5, alienMin.getTamaño());
        assertEquals(1.0, alienMin.getPrecioCuerpo(), 0.01); 

        Aliens alienMax = new Aliens(30, "Negro");
        assertEquals(30, alienMax.getTamaño());
        assertEquals(6.0, alienMax.getPrecioCuerpo(), 0.01); 
    }

    @Test
    public void testValoresNegativos() {
        Aliens alienNegativo = new Aliens(-10, "Gris");
        assertEquals(5, alienNegativo.getTamaño());
        assertEquals(1.0, alienNegativo.getPrecioCuerpo(), 0.01); 
    }
    
    @Test
    public void testColorNulo() {
        Aliens alienNulo = new Aliens(10, null);
        assertNull(alienNulo.getColor());
        assertEquals(10, alienNulo.getTamaño());
    }
}
