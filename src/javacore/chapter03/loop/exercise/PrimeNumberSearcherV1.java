package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV1 {

    public static void main(String[] args) {

        for (int number = 2; number <= 100; number++) {

            boolean isPrime = true;

            for (int divisor = 2; divisor < number; divisor++) {

                if (number % divisor == 0) {

                    isPrime = false;
                }
            }

            if (isPrime) {

                System.out.println(number + " est un nombre premier");
            }
        }
    }
}
