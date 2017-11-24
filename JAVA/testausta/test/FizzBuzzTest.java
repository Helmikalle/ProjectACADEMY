import ma.testi.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test

    public void onkoFizz (){
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz",fb.tulos(3));
        assertEquals("Fizz",fb.tulos(6));
    }
    @Test
    public void onkoBuzz (){
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz",fb.tulos(5));
        assertEquals("Buzz", fb.tulos(10));
    }
    @Test
    public void onkoFizzBuzz (){
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.tulos(15));
        assertEquals("FizzBuzz", fb.tulos(30));
    }
}
