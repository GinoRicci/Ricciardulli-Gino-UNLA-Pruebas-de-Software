package testPista;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import avion.AvionSimple;
import copControl.Mapa;
import copControl.Posicion;
import pista.PistaSimple;
import pista.PosicionesEntradaVaciaException;

public class PistaSimpleTest {
    
    private PistaSimple pista;
    private AvionSimple avionSimple;

    @Before
    public void setUp() throws PosicionesEntradaVaciaException {
        // Configurar el entorno de prueba
        // Posición de entrada de la pista
        Posicion posicionEntrada = new Posicion(0, 0);
        // Crear una instancia de PistaSimple
        pista = new PistaSimple(posicionEntrada);
        // Crear instancia de avionSimple
        avionSimple = new AvionSimple(new Posicion(1, 1), new Posicion(10, 10), new Mapa());
    }

    @Test
    public void testPuedeAterrizarAvionSimple() {
        // Verificar que un AvionSimple pueda aterrizar en una PistaSimple
        assertTrue(pista.puedeAterrizar(avionSimple));
    }
}
