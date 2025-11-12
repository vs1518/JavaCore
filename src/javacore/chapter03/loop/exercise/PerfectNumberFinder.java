package javacore.chapter03.loop.exercise;

public class PerfectNumberFinder {

    public static void main(String[] args) {

        int start = 1;
        int end = 1000;

        for (int potentialPerfectNumber = start; potentialPerfectNumber <= end; potentialPerfectNumber++) {

            int divisorSum = 0;

            for (int potentialDivisor = 1; potentialDivisor < potentialPerfectNumber; potentialDivisor++) {

                if (potentialPerfectNumber % potentialDivisor == 0) {

                    divisorSum = divisorSum + potentialDivisor;
                }
            }

            if (divisorSum == potentialPerfectNumber) {
                System.out.println(potentialPerfectNumber + " est un nombre parfait");
            }
        }

    }
}
