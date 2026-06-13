package com.krakedev.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.entidades.Aliens;

class PruebasJUnitFinales {

	@Test
    public void testCalculoPrecioYComportamiento() {

        Aliens alien = new Aliens(10, "Celeste");
        
        assertTrue(alien.agregarBrazos(2), "Debe permitir agregar 2 brazos");

        assertEquals(4.0, alien.getPrecioTotal(), 0.01, "El precio tras agregar 2 brazos debe ser 4.0");

        assertTrue(alien.agregarPiernas(2), "Debe permitir agregar 2 piernas");

        assertEquals(6.0, alien.getPrecioTotal(), 0.01, "El precio tras agregar 2 piernas debe ser 6.0");

        assertTrue(alien.agregarOjos(3), "Debe permitir agregar 3 ojos");

        assertEquals(7.5, alien.getPrecioTotal(), 0.01, "El precio tras agregar 3 ojos debe ser 7.5");
    }

    @Test
    public void testRestriccionesDeNegocioNoAlteranPrecio() {
        Aliens alien = new Aliens(20, "Naranja");

        alien.agregarBrazos(5);
        alien.agregarPiernas(5); 
        alien.agregarOjos(5);   
        
        double precioAlLimite = alien.getPrecioTotal();
        assertEquals(29.0, precioAlLimite, 0.01);
        
        assertFalse(alien.agregarBrazos(1), "Restricción: No debe permitir más de 10 extremidades");
        assertFalse(alien.agregarPiernas(2), "Restricción: No debe permitir más de 10 extremidades");
        
        assertFalse(alien.agregarOjos(1), "Restricción: No debe permitir más de 5 ojos para tamaño 20");
        
        assertEquals(precioAlLimite, alien.getPrecioTotal(), 0.01, "El precio total no debe cambiar si las adiciones fallan por restricciones");
    }

}
