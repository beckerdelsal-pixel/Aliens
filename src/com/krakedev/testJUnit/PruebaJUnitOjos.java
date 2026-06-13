/**
 * 
 */
package com.krakedev.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.entidades.Aliens;

/**
 * 
 */
class PruebaJUnitOjos {

	@Test
    public void testRangoPequeno() {

        Aliens alienPequeno = new Aliens(8, "Verde");
        
        assertTrue(alienPequeno.agregarOjos(2), "Debe permitir agregar 2 ojos");
        assertTrue(alienPequeno.agregarOjos(1), "Debe permitir agregar 1 ojo más (total 3)");
        assertFalse(alienPequeno.agregarOjos(1), "Debe fallar al intentar superar el límite de 3 ojos");
        assertEquals(3, alienPequeno.getNumeroOjos());
    }

    @Test
    public void testRangoMediano() {

        Aliens alienMediano = new Aliens(15, "Morado");
        
        assertTrue(alienMediano.agregarOjos(5), "Debe permitir agregar 5 ojos directamente");
        assertFalse(alienMediano.agregarOjos(1), "Debe fallar al intentar agregar un sexto ojo");
        assertEquals(5, alienMediano.getNumeroOjos());
    }

    @Test
    public void testRangoGrande() {

        Aliens alienGrande = new Aliens(25, "Rojo");
        
        assertTrue(alienGrande.agregarOjos(4), "Debe permitir agregar 4 ojos");
        assertTrue(alienGrande.agregarOjos(3), "Debe permitir agregar 3 ojos más (total 7)");
        assertFalse(alienGrande.agregarOjos(2), "Debe fallar al intentar agregar ojos que superen los 7");
        assertEquals(7, alienGrande.getNumeroOjos());
    }

}
