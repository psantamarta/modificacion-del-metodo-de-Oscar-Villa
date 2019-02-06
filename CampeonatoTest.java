
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

    //Test para los metodos 01 y 02
    @Test
    public void Test01y02()
    {
        Campeonato campeona1 = new Campeonato();
        assertEquals("", campeona1.informacionParticipantes());
        campeona1.anadirParticipante(1, "Daniels", 186, 76.54,true);
        assertEquals("Daniels de id 1 con una altura de 186cm y un peso de 76.54Kg y tiene equipo.\n", campeona1.informacionParticipantes());
        campeona1.anadirParticipante(2, "Larosa", 154, 54, false);
        assertEquals("Daniels de id 1 con una altura de 186cm y un peso de 76.54Kg y tiene equipo.\nLarosa de id 2 con una altura de 154cm y un peso de 54.0Kg y no tiene equipo.\n", campeona1.informacionParticipantes());
    }

    //Test para el metodo 03
    @Test
    public void Test03()
    {
        Campeonato campeona1 = new Campeonato();
        assertEquals("", campeona1.informacionParticipantes());
        campeona1.anadirParticipante(1, "Daniels", 186, 76.54,true);
        assertEquals("Daniels de id 1 con una altura de 186cm y un peso de 76.54Kg y tiene equipo.\n", campeona1.participantesOrdenadosPorAltura());
        campeona1.anadirParticipante(2, "Larosa", 154, 54, false);
        assertEquals("Larosa de id 2 con una altura de 154cm y un peso de 54.0Kg y no tiene equipo.\nDaniels de id 1 con una altura de 186cm y un peso de 76.54Kg y tiene equipo.\n", campeona1.participantesOrdenadosPorAltura());
    }

    //Test para el metodo 04
    @Test
    public void Test04()
    {
        Campeonato campeona1 = new Campeonato();
        assertEquals("", campeona1.informacionParticipantes());
        campeona1.anadirParticipante(1, "Daniels", 186, 76.54,true);
        assertEquals("Daniels de id 1 con una altura de 186cm y un peso de 76.54Kg y tiene equipo.\n", campeona1.participantesConEquipoOrdenadosPorPeso());
        campeona1.anadirParticipante(2, "Larosa", 154, 54, false);
        assertEquals("Daniels de id 1 con una altura de 186cm y un peso de 76.54Kg y tiene equipo.\n", campeona1.participantesConEquipoOrdenadosPorPeso());

        Campeonato campeona2 = new Campeonato();
        assertEquals("", campeona2.informacionParticipantes());
        campeona2.anadirParticipante(1, "Daniels", 186, 76.54,false);
        assertEquals("", campeona2.participantesConEquipoOrdenadosPorPeso());
        campeona2.anadirParticipante(2, "Larosa", 154, 54, true);
        campeona2.anadirParticipante(3, "Oswaldo", 170, 58, true);
        assertEquals("Larosa de id 2 con una altura de 154cm y un peso de 54.0Kg y tiene equipo.\nOswaldo de id 3 con una altura de 170cm y un peso de 58.0Kg y tiene equipo.\n", campeona2.participantesConEquipoOrdenadosPorPeso());
    }

    //Test para el metodo 05
    @Test
    public void Test05()
    {
        Campeonato campeona1 = new Campeonato();
        assertEquals("", campeona1.informacionParticipantes());
        campeona1.anadirParticipante(1, "Daniels", 186, 76.54,true);
        assertEquals("Daniels de id 1 con una altura de 186cm y un peso de 76.54Kg y tiene equipo.\n", campeona1.participantesConEquipoOrdenadosPorPeso());
        campeona1.anadirParticipante(2, "Larosa", 154, 54, false);
        assertEquals("Daniels de id 1 con una altura de 186cm y un peso de 76.54Kg y tiene equipo.\n", campeona1.participantesConEquipoOrdenadosPorPeso());

        campeona1.modificarSiTieneEquipo(1, false);
        assertEquals("", campeona1.participantesConEquipoOrdenadosPorPeso());
        campeona1.modificarSiTieneEquipo(2, true);
        campeona1.anadirParticipante(3, "Oswaldo", 170, 58, true);
        assertEquals("Larosa de id 2 con una altura de 154cm y un peso de 54.0Kg y tiene equipo.\nOswaldo de id 3 con una altura de 170cm y un peso de 58.0Kg y tiene equipo.\n", campeona1.participantesConEquipoOrdenadosPorPeso());
    }

    //Test para el metodo 06
    @Test
    public void Test06()
    {
        Campeonato campeona1 = new Campeonato();
        assertEquals("", campeona1.informacionParticipantes());
        campeona1.anadirParticipante(1, "Daniels", 186, 76.54,true);
        campeona1.anadirParticipante(2, "Larosa", 154, 54, false);
        campeona1.anadirParticipante(3, "Oswaldo", 170, 58, true);
        campeona1.eliminarLosQueTenganMenosPeso(55);
        assertEquals("Daniels de id 1 con una altura de 186cm y un peso de 76.54Kg y tiene equipo.\nOswaldo de id 3 con una altura de 170cm y un peso de 58.0Kg y tiene equipo.\n", campeona1.informacionParticipantes());
    }
}

