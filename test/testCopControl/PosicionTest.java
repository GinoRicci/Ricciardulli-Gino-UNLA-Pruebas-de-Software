package testCopControl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import copControl.Posicion;

public class PosicionTest {
    
    private Posicion posicion1;
    private Posicion posicion2;
    private Posicion posicion3;

    @Before
    public void setUp() {
        // Configurar el entorno de prueba
        posicion1 = new Posicion(1, 2);
        posicion2 = new Posicion(3, 4);
        posicion3 = new Posicion(3, 4);
    }

    @Test
    public void testIgualA() {
        // Verificar si dos posiciones son iguales
        assertFalse(posicion1.igualA(posicion2));
        assertTrue(posicion2.igualA(posicion3));
    }
}
