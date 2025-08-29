package javacore.chapter03.loop.exercise;

public class FactorialCalculator {

    public static void main(String[] args) {

        //7, 9, 11, 20 et 21(ça provoque un overflow(débordement))

        //BONUS [⭐️⭐️⭐️] - Faites en sorte que votre programme gère les différents cas particuliers suivants :
        //
        //Si number est inférieure à 0, affichez une erreur explicite.
        //
        //Si number est égale à 0, le résultat est automatiquement 1 (par définition mathématiques).
        //
        //Sinon, calculez la factorielle de number et affichez le résultat.


        long number = 20;
        long initialValue = number;

        long result = 1;

        if (number < 0) {
            System.out.println("Erreur : " + number + " est inférieur à 0, la factorielle n'est pas définie.");
        }

        if (number == 0) {
            System.out.println("Le résultat est automatiquement égale à 1 ");
        }

        while (number > 0) {
            result = result * number;
            number--;
        }

        System.out.println("Résultat de " + initialValue + " est égal à " + result);


    }
}
