package com.krakedev.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.entidades.Aliens;

class PruebasJUnitParte7 {

	@Test
    public void testCasosValidos() {

        Aliens alien = new Aliens(15, "Verde");
        
        assertTrue(alien.agregarBrazos(4), "Debería poder agregar 4 brazos");
        assertTrue(alien.agregarPiernas(4), "Debería poder agregar 4 piernas");
        
        assertEquals(4, alien.getNumeroBrazos());
        assertEquals(4, alien.getNumeroPies());
    }

    @Test
    public void testCasosLimite() {
        Aliens alien = new Aliens(20, "Azul");
        
        assertTrue(alien.agregarBrazos(10), "Debería permitir agregar exactamente 10 brazos");
        
        assertFalse(alien.agregarPiernas(1), "No debería permitir agregar 1 pierna si ya tiene 10 brazos");
        
        Aliens alien2 = new Aliens(10, "Rojo");
        assertFalse(alien2.agregarBrazos(11), "No debería permitir agregar 11 brazos de una sola vez");
    }

    @Test
    public void testCasosCombinados() {
        Aliens alien = new Aliens(25, "Amarillo");
        
        assertTrue(alien.agregarBrazos(6), "Agrega 6 brazos correctamente");
        
        assertFalse(alien.agregarPiernas(5), "Debe fallar al intentar agregar 5 piernas (total 11)");
        
        assertEquals(0, alien.getNumeroPies(), "Las piernas no debieron agregarse al fallar la validación");
        
        assertTrue(alien.agregarPiernas(4), "Debe permitir agregar 4 piernas para llegar al límite de 10");
        
        int totalExtremidades = alien.getNumeroBrazos() + alien.getNumeroPies();
        assertEquals(10, totalExtremidades, "El total de extremidades debe ser exactamente 10");
    }

}
