import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HenkilotunnusTest {
    @Test
    public void onkoPvmOikea (){

        Henkilotunnus hetu = new Henkilotunnus();
        assertEquals(false,hetu.tarkista("1988-03-10"));
        assertEquals(false,hetu.tarkista("2017-11-32"));
        assertEquals(false,hetu.tarkista("1999-13-02"));

    }
    @Test
    public void toimiikoParse (){
        Henkilotunnus hetu = new Henkilotunnus();
        assertEquals(true,hetu.tarkista("88 10 10"));
    }

}