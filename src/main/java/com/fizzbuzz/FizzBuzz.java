package com.fizzbuzz;

public class FizzBuzz {

    public String convert(int number) {
        String numberAsText = String.valueOf(number);
        boolean isFizz = number % 3 == 0 || numberAsText.contains("3");
        boolean isBuzz = number % 5 == 0 || numberAsText.contains("5");

        if (isFizz && isBuzz) {
            return "FizzBuzz";
        }

        if (isFizz) {
            return "Fizz";
        }

        if (isBuzz) {
            return "Buzz";
        }

        return numberAsText;
    }
}
