package testAvion;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import avion.AvionPesado;
import copControl.Mapa;
import copControl.Posicion;

public class AvionPesadoTest {
    private AvionPesado avion;
    private Mapa mapa;

    @Before
    public void setUp() {
        // Configurar el entorno de prueba
        // Simulamos un mapa
        mapa = new Mapa();
        // Instancia de AvionPesado
        avion = new AvionPesado(new Posicion(0, 0), new Posicion(10, 10), mapa);
    }

    @Test
    public void testMoverHacia() {
        // Crear un destino
        Posicion destino = new Posicion(5, 5);
        // Llamar al método moverHacia con la posición de destino
        avion.moverHacia(destino);
        // Verificar que la posición de destino sea igual a la posición actual del avión
        assertEquals(destino, avion.getPosicionActual());
    }
}
