
import org.example.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzShould {
    @Test
    public void convert_1_to_1(){
        assertEquals("1",new FizzBuzz().convert(1));
    }

    @Test
    public void convert_2_to_2(){
        assertEquals("2",new FizzBuzz().convert(2));
    }
}
