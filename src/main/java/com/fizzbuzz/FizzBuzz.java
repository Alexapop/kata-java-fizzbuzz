package com.fizzbuzz;

public class FizzBuzz {

    public String convert(int number) {
        String numberAsText = String.valueOf(number);

        if (
            (number % 3 == 0 || numberAsText.contains("3"))
            &&
            (number % 5 == 0 || numberAsText.contains("5"))
        ) {
            return "FizzBuzz";
        }

        if (number % 3 == 0 || numberAsText.contains("3")) {
            return "Fizz";
        }

        if (number % 5 == 0 || numberAsText.contains("5")) {
            return "Buzz";
        }

        return numberAsText;
    }
}
