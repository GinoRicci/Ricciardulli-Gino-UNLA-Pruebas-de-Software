package testAvion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import avion.Helicoptero;
import copControl.Mapa;
import copControl.Posicion;

public class HelicopteroTest {
    private Helicoptero helicoptero;
    private Mapa mapa;

    @Before
    public void setUp() {
        // Configurar el entorno de prueba
        // Crear una instancia de Mapa
        mapa = new Mapa();
        // Crear una instancia de Helicoptero
        helicoptero = new Helicoptero(new Posicion(0, 0), new Posicion(5, 5), mapa);
    }

    @Test
    public void testDetener() {
        // Detener el helicóptero
        helicoptero.detener();

        // Verificar que el helicóptero esté marcado como detenido
        assertTrue(helicoptero.estaDetenido());
    }
}
