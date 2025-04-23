package javacore.chapter02.condition.exercise;

public class NumberSignVerifier {

    public static void main(String[] args) {

        int number = 45;

        if ( number > 0 ){
            System.out.println("C'est la valeur positive");
        }

        else if ( number < 0 ) {
            System.out.println("C'est la valeur negative");
        }

        else {
            System.out.println("C'est la valeur est neutre");
        }

    }
}
