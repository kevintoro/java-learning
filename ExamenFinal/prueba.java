

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class prueba.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class prueba
{
    /**
     * Default constructor for test class prueba
     */
    public prueba()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void traductor()
    {
        Traductor traducto1 = new Traductor();
        assertNull(traducto1.buscarTraduccionDe("casa", 1));
        traducto1.agregarTraduccion("casa", "house", 1);
        assertNotNull(traducto1.buscarTraduccionDe("casa", 1));
        assertNull(traducto1.buscarTraduccionDe("casa", 2));
        traducto1.agregarTraduccion("casa", "home", 2);
        assertNotNull(traducto1.buscarTraduccionDe("casa", 2));
        assertEquals(1, traducto1.darTamanioDirectorio(1));
        assertEquals(1, traducto1.darTamanioDirectorio(2));
        traducto1.agregarTraduccion("'perro", "dog", 1);
        assertEquals(2, traducto1.darTamanioDirectorio(1));
        assertEquals(1, traducto1.darTamanioDirectorio(2));
    }
}

