package javacore.chapter03.loop.exercise;

public class SmallestDivisorFinder {

        public static void main(String[] args) {

            //20, 23, 15 , 9
            int number = 8;
            int divisor = 3;

            while (number % divisor != 0) {

                divisor++;
            }
            if (divisor == number) {
                System.out.println(number + " est un nombre premier (aucun diviseur autre que 1 et lui-même).");
            }

            else {
                System.out.println("Le plus petit diviseur de " + number + " est : " + divisor);
            }

        }
}



