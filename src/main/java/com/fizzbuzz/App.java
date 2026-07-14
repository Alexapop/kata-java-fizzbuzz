package com.fizzbuzz;

public class App {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int number = 1; number <= 100; number++) {
            System.out.println(fizzBuzz.convert(number));
        }
    }
}