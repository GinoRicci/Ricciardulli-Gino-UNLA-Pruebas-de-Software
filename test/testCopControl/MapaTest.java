package testCopControl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import avion.Avion;
import avion.AvionSimple;
import copControl.Mapa;
import copControl.Posicion;

public class MapaTest {

    private Mapa mapa;

    @Before
    public void setUp() {
        // Configurar el entorno de prueba
        // Crear una instancia de Mapa
        mapa = new Mapa();
    }

    @Test
    public void testColocarAvionEnAire() {
        // Crear una instancia de Avion
        Avion avion = new AvionSimple(new Posicion(0, 0), new Posicion(10, 10), mapa);

        // Agregar el avión al mapa
        mapa.colocarAvionEnAire(avion);

        // Verificar que el avión esté en la lista de aviones en el aire del mapa
        assertTrue(mapa.getAvionesEnAire().contains(avion));
    }
}