package javacore.chapter03.loop.exercise;

public class PerfectNumberFinder {

    public static void main(String[] args) {

        int start = 1;
        int end = 1000;

        for (int number = start; number <= end; number++) {

            int sum = 0;

            for (int divisor = 1; divisor < number; divisor++) {

                if (number % divisor == 0) {

                    sum = sum + divisor;
                }
            }

            if (sum == number) {
                System.out.println(number + "est un nombre parfait");
            }
        }

    }
}
