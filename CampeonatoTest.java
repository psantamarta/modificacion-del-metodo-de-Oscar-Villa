

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CampeonatoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CampeonatoTest
{
    /**
     * Default constructor for test class CampeonatoTest
     */
    public CampeonatoTest()
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
    public void Test01y02()
    {
        Campeonato campeona1 = new Campeonato();
        assertEquals("", campeona1.informacionParticipantes());
        campeona1.anadirParticipante(1, "Daniels", 186, 76.54);
        assertEquals("Daniels de id 1 con una altura de 186cm y un peso de 76.54Kg.\n", campeona1.informacionParticipantes());
        campeona1.anadirParticipante(2, "Larosa", 154, 54);
        assertEquals("Daniels de id 1 con una altura de 186cm y un peso de 76.54Kg.\nLarosa de id 2 con una altura de 154cm y un peso de 54.0Kg.\n", campeona1.informacionParticipantes());
    }
}



