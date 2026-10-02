package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV2 {

    public static void main (String[] args) {

        int number = 2;      // nombre à vérifier / число для проверки
        int primeCount = 0;  // compteur / счетчик
        int iterationCount = 0; //compteur d'itération / счетчик итераций

         while (primeCount < 50) {  // chercher 50 nombres premiers/ищем 50 простых чисел

             boolean isPrime = true;     //простое число
             int iterationForCurrentNumber = 0;

             for (int divisor = 2; divisor < number; divisor++) {

                iterationCount++;
                iterationForCurrentNumber++;

                if (number % divisor == 0) {

                    isPrime = false;
                    break;
                }
             }

             System.out.println(
                     "Nombre " + number + " -> " + iterationForCurrentNumber + " iteration(s)"
             );
            if (isPrime) {

                System.out.println(number + " est un nombre premier");
                primeCount++;

            }
            number++;
         }
        System.out.println("Nombre d'iterations : " + iterationCount);
    }
}