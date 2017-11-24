package fi.academy.testaus;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 5.10.2017.
 */
public class LuokkaTest {
        private Luokka s;
    @Before
    public void setUp() throws Exception {
        s = new Luokka();
        s.setSana(null);

    }

    @Test
    public void seacrest() throws Exception {
        List<Object> lista =Arrays.asList(new Integer[]{2, 4, 6, 8, 10});
        List<String> lista1 = Arrays.asList(new String[]{"kalle","outi","eliel"});
        assertThat("yksi", is(equalTo("yksi")));
        assertThat(5,is(greaterThan(4)));
        assertThat(lista1,not(hasItem("poju")));
        assertThat( 0.1+0.2,is(closeTo(0,3)));
        assertThat("sana",is(equalToIgnoringCase("SANA")));
        assertThat(lista,is(hasItem(10)));
        assertThat(10.0,is(lessThan(10.1)));

    }

    @Test

   public void testaaIso (){

        String testaaIso = s.setSana("yksi");
        String isoSana = s.getIsoSana();
        assertEquals("On iso",isoSana,isoSana);
        assertEquals("Pituus oikein",isoSana.length(),testaaIso.length());




    }

    @Test
    public void testaaLuokanLuonti() throws Exception {
        assertNotNull("Olio ei ole null", s);
        assertNull("Luodun olion sana-kenttä on null", s.getSana());

    }

    @Test
    public void liukulukuTest() throws Exception {
        assertEquals(1.14, 0.68+0.46,0.00000000000001);

    }

    @Test
    public void onkoSamaa() throws Exception {
        String eka = new String("sama");
        String toinen = new String(eka);
        assertEquals("Onko sama",eka,toinen);
        //assertSame("Vieläkö sama",eka,toinen);
        //assertNotEquals("Ja taas",eka,toinen);

    }



    @Test (expected = AlustamatonLuokkaException.class)

    public void poikkeus() throws Exception {
        assertEquals(s.getIsoSana(),s.getSana());

    }

    @Test (expected = AlustamatonLuokkaException.class)
    public void alustamatonLuokkaEiTueIsoSanaMetodinKutsua() throws Exception {
        String iso =s.getIsoSana();

    }

}
