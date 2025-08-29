package javacore.chapter03.loop.practice;

public class PracticeLoopFor {

    public static void main(String[] args) {

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

        int resultFor = 0;

        //cNumber = cNumber + 1  soit cNumber += 1)
        for (int cNumber = 1 ; cNumber <= maxNumber ; cNumber++)  {
            System.out.println("Result = " + resultFor + " + " + cNumber);
            resultFor += cNumber; //result = result + currentNumber
            System.out.println("------> " + resultFor);
        }

        System.out.println("Somme des nombres de 1 à 100 : " + resultFor);

    }
}