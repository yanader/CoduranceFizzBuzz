import org.example.FizzBuzz;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.*;

public class FizzBuzzShould {

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4"})
    void convert_number_to_FizzBuzz_string(int input, String expectedOutput){
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({"3,Fizz","6,Fizz","9,Fizz"})
    void convert_multiple_of_3_to_Fizz(int input, String expectedOutput){
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({"5,Buzz","10,Buzz","50,Buzz"})
    void convert_multiple_of_5_to_Buzz(int input, String expectedOutput){
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({"15,FizzBuzz","30,FizzBuzz","45,FizzBuzz"})
    void convert_multiples_of_3_and_5_to_FizzBuzz(int input, String expectedOutput){
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @ValueSource(ints={3,6,9})
    void confirm_number_is_multiple_of_3(int input){
        assertTrue(new FizzBuzz().is_multiple_of_3(input));
    }

    @ParameterizedTest
    @ValueSource(ints={4,7,10})
    void confirm_number_is_not_multiple_of_3(int input){
        assertFalse(new FizzBuzz().is_multiple_of_3(input));
    }

    @ParameterizedTest
    @ValueSource(ints={5,10,15})
    void confirm_number_is_multiple_of_5(int input){
        assertTrue(new FizzBuzz().is_multiple_of_5(input));
    }

    @ParameterizedTest
    @ValueSource(ints={4, 11, 19})
    void confirm_number_is_not_multiple_of_5(int input){
        assertFalse(new FizzBuzz().is_multiple_of_5(input));
    }

}
