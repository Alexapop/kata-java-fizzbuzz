package com.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FizzBuzzTest {

    @Test
    public void testReturnsFizzBuzzWhenDivisibleBy15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.convert(15), is("FizzBuzz"));
    }

    @Test
    public void testReturnsFizzWhenDivisibleBy3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.convert(3), is("Fizz"));
    }

    @Test
    public void testReturnsBuzzWhenDivisibleBy5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.convert(5), is("Buzz"));
    }

    @Test
    public void testReturnsFizzWhenContains3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.convert(23), is("Fizz"));
    }

    @Test
    public void testReturnsBuzzzWhenContains5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.convert(59), is("Buzz"));
    }

    @Test
    public void testReturnsNumberWhenNoConditionIsMet() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.convert(11), is("11"));
    }
}
