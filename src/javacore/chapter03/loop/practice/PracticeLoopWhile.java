package javacore.chapter03.loop.practice;

public class PracticeLoopWhile {

    public static void main(String[] args) {

        int age = 15;

        if (age < 18) {
            System.out.println("Condition - Age = " + age);
        }

        while (age < 18) {
            System.out.println("Boucle - Age = " + age);
            age++; //age = age + 1 ;
        }

        System.out.println("On est sortie de la boucle");


        int result = 0;

        int currentNumber = 1;
        int maxNumber = 100;

        while (currentNumber <= maxNumber) {

            System.out.println("Result = " + result + " + " + currentNumber);
            result += currentNumber; //result = result + currentNumber
            System.out.println("------> " + result);

            currentNumber++;         // currentNumber = currentNumber + 1;

        }

        System.out.println("Somme des nombres de 1 à 100 : " + result);

    }
}
