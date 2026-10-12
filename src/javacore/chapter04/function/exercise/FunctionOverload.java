package javacore.chapter04.function.exercise;

public class FunctionOverload {

    // 1. Point d'entrée du programme
    public static void main(String[] args) {

        // Appel de la méthode avec deux arguments
        int result1 = sum(10, 20);
        System.out.println(result1);

        // Appel de la méthode avec trois arguments
        int result2 = sum(10, 20, 30);
        System.out.println(result2);
    }

    // 2. Déclaration d'une méthode avec deux paramètres
    static int sum(int number1, int number2) {

        // Retourne la somme des deux paramètres
        return number1 + number2;
    }

    // 3. Surcharge : même nom, trois paramètres
    static int sum(int number1, int number2, int number3) {

        // Réutilise la première méthode et ajoute number3
        return sum(number1, number2) + number3;
    }
}