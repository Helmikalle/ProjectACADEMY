package fi.academy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LaskinTest {
    Laskin laskin = new Laskin();
    private Nimi nimi = new Nimi();

    @Test
    public void testaaLaskinOsaaSummata(){
        assertEquals(3, laskin.laskeYhteen(1,2));
        assertEquals(4, laskin.laskeYhteen(2,2));
    }
    @Test
    public void laskinOsaaSummataUseanLuvun (){
        assertEquals(6,laskin.laskeYhteen(1,2,3));
        assertEquals(10, laskin.laskeYhteen(1,2,3,4));
    }

    @Test
    public void laskinEiKaaduRajaArvoilla() throws Exception {
        assertEquals(-1,laskin.laskeYhteen(-1));
        assertEquals(0,laskin.laskeYhteen());
        //assertEquals(0,laskin.laskeYhteen(null));
        assertEquals(6,laskin.laskeYhteen(new int[]{1,5}));
    }

    @Test
    public void laskinOsaaLaskeaLiukulukuja() throws Exception {
        assertEquals(0.3,laskin.laskeYhteen(0.1,0.2),0.0000001);

    }

    @Before
    public void beforeEach (){
        nimi = new Nimi();
    }

    @Test
    public void helloBob() throws Exception {
        assertEquals("Hello, Bob!",nimi.greet());

}
    @Test
    public void helloName (){
        assertEquals("Hello, Fred!", nimi.greet("Fred"));

    }

}
