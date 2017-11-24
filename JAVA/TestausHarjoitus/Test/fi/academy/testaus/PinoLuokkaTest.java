package fi.academy.testaus;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Administrator on 5.10.2017.
 */
public class PinoLuokkaTest {

    PinoToteutus olio;
    @Before
    public void setUp() throws Exception {
        olio = new PinoToteutus();

    }

    @Test
    public void onkoTyhja() throws Exception {
        assertThat(,is(hasItem(0)));
        assertThat(5,is(greaterThan(4)));
        assertThat("yksi", is(equalTo("yksi")));
        assertThat(,is(hasItem(10)));
        assertThat(10.0,is(lessThan(10.1)));
    }

    @Test
    public void push() throws Exception {
        assertThat(olio, is(notNullValue()));


    }
}