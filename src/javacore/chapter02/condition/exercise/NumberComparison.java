package javacore.chapter02.condition.exercise;

public class NumberComparison {

    public static void main(String[] args) {

        int number1 = 15;
        int number2 = 5;

        if ( number1 > number2 ) {
            System.out.println("Numero 1 a la plus grande valeur");
        }
        else if ( number1 < number2) {
            System.out.println("Numero 2 a la plus grand valeur");
        }
        else {
            System.out.println("C'est une égalité!");
        }
    }
}
