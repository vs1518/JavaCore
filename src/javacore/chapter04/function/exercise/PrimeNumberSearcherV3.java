package javacore.chapter04.function.exercise;

public class PrimeNumberSearcherV3 {

    public static void main(String[] args) {

        int count = 0;  //compteur de nombres premieres
        int number = 2; //à partir de ce nombre je commence à chercher les nombres premiers

        while (count < 50) {
            if (isPrimeNumber(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPrimeNumber(int number) {
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}